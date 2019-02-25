package org.dc.stack4us.controller;

import java.util.List;
import org.dc.stack4us.domain.Middleware;
import org.dc.stack4us.service.MiddlewareService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/middleware")
public class MiddlewareController {
  private Logger log = LoggerFactory.getLogger(this.getClass());

  private MiddlewareService middlewareService;

  @Autowired
  MiddlewareController(MiddlewareService middlewareService) {
    this.middlewareService = middlewareService;
  }

  @GetMapping
  public List<Middleware> list() {
    return middlewareService.list();
  }

  @GetMapping("/{id}")
  public Middleware get(@PathVariable Long id) {
    return middlewareService.get(id);
  }

  @PostMapping(consumes = "application/json")
  public void create(@RequestBody Middleware middleware) {
    log.info(middleware.toString());
    middlewareService.create(middleware);
  }
}
