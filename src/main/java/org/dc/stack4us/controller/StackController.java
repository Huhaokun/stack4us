package org.dc.stack4us.controller;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.dc.stack4us.domain.Stack;
import org.dc.stack4us.service.StackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/stack")
public class StackController {

  private StackService stackService;

  @Autowired
  StackController(StackService stackService) {
    this.stackService = stackService;
  }

  @GetMapping
  public List<Stack> list() {
    return stackService.list();
  }

  @GetMapping("/{id}")
  public Stack get(@PathVariable Long id) {
    return stackService.get(id);
  }

  @PostMapping(consumes = "application/json")
  public void create(@RequestBody Stack stack) {
    log.info(stack.toString());
    stackService.create(stack);
  }
}
