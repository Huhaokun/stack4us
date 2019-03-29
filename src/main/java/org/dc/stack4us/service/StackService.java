package org.dc.stack4us.service;

import java.util.List;
import org.dc.stack4us.domain.Stack;
import org.dc.stack4us.store.StackMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StackService {
  private final StackMapper stackMapper;

  @Autowired
  public StackService(StackMapper stackMapper) {
    this.stackMapper = stackMapper;
  }

  public List<Stack> list() {
    return stackMapper.list();
  }
  public Stack get(Long id) {
    return stackMapper.get(id);
  }

  public void create(Stack stack) {
    stackMapper.create(stack);
  }
  public void update(Stack stack) {
  }


}
