package org.dc.stack4us.controller;

import org.dc.stack4us.domain.Domain;
import org.dc.stack4us.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/domain")
public class DomainController {
    private DomainService domainService;

    @Autowired
    public DomainController(DomainService domainService) {
        this.domainService = domainService;
    }

    @GetMapping
    public List<Domain> list() {
        return domainService.list();
    }

    @GetMapping("/{id}")
    public Domain get(@PathVariable Long id) {
        return domainService.get(id);
    }

    @PostMapping(consumes = "application/json")
    public void create(@RequestBody Domain domain) {
        domainService.create(domain);
    }

}
