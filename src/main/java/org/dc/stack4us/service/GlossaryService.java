package org.dc.stack4us.service;

import java.util.List;
import org.dc.stack4us.domain.Glossary;
import org.dc.stack4us.store.GlossaryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GlossaryService {
  private final GlossaryWrapper glossaryWrapper;

  @Autowired
  public GlossaryService(GlossaryWrapper glossaryWrapper) {
    this.glossaryWrapper = glossaryWrapper;
  }

  public List<Glossary> list() {
    return glossaryWrapper.list();
  }

  public Glossary get(Long id) {
    return glossaryWrapper.get(id);
  }

  public void create(Glossary glossary) {
    glossaryWrapper.create(glossary);
  }

  public void update(Glossary glossary) {
    glossaryWrapper.update(glossary);
  }

  public void delete(Long id) {
    glossaryWrapper.delete(id);
  }
}
