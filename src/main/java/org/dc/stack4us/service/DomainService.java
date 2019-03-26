package org.dc.stack4us.service;

import org.dc.stack4us.domain.Domain;
import org.dc.stack4us.store.DomainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomainService {
    private DomainMapper domainMapper;

    @Autowired
    public DomainService(DomainMapper domainMapper) {
       this.domainMapper = domainMapper;
    }

    public void create(Domain domain) {
        domainMapper.create(domain);
    }

    public List<Domain> list() {
        return domainMapper.list();
    }

    public Domain get(Long id) {
        return domainMapper.get(id);
    }

    public Domain findByName(String name) {
        return domainMapper.findByName(name);
    }
}
