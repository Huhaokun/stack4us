package org.dc.stack4us.service;

import java.util.List;
import org.dc.stack4us.domain.Middleware;
import org.dc.stack4us.store.MiddlewareMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MiddlewareService {
  private final MiddlewareMapper middlewareMapper;

  @Autowired
  public MiddlewareService(MiddlewareMapper middlewareMapper) {
    this.middlewareMapper = middlewareMapper;
  }

  public List<Middleware> list() {
    return middlewareMapper.list();
  }
  public Middleware get(Long id) {
    return middlewareMapper.get(id);
  }

  public void create(Middleware middleware) {
    middlewareMapper.create(middleware);
  }
  public void update(Middleware middleware) {
  }


}
