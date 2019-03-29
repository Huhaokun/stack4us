package org.dc.stack4us.task;

import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.PostConstruct;
import org.dc.stack4us.service.StackService;
import org.kohsuke.github.GitHub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SyncGithubTask {

  private ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(5);

  private StackService stackService;
  private GitHub gitHub;

  @Autowired
  public SyncGithubTask(StackService stackService) {
    this.stackService = stackService;
  }

  @PostConstruct
  public void init() {
    // Step 1 connection to github
    try {
      gitHub = GitHub.connect();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Step 2 update info periodically
    scheduledExecutorService.scheduleAtFixedRate(() -> {
      this.stackService.list().forEach(m -> {
        try {
          int star = gitHub.getRepository(m.getGithubUrl()).getStargazersCount();
          m.setStarNum(star);
          stackService.update(m);
        } catch (IOException e) {
          e.printStackTrace();
        }
      });
    }, 5, 5 * 60, TimeUnit.SECONDS);
  }
}
