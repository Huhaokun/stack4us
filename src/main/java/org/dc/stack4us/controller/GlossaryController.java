package org.dc.stack4us.controller;

import java.util.List;
import org.dc.stack4us.domain.Glossary;
import org.dc.stack4us.service.GlossaryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/glossary")
public class GlossaryController {

  private GlossaryService glossaryService;

  public GlossaryController(GlossaryService glossaryService) {
    this.glossaryService = glossaryService;
  }

  @GetMapping()
  public List<Glossary> list() {
    return glossaryService.list();
  }

  @GetMapping("/{id}")
  public Glossary get(@PathVariable Long id) {
    return glossaryService.get(id);
  }

  @PostMapping()
  public void create(@RequestBody Glossary glossary) {
    glossaryService.create(glossary);
  }
}
