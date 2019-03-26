package org.dc.stack4us.store;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.dc.stack4us.domain.Domain;
import org.dc.stack4us.domain.Middleware;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DomainMapper {
    @Select("SELECT id, name from domain")
    List<Domain> list();

    @Select("SELECT id, name from domain where id = #{id}")
    Domain get(Long id);

    @Select("SELECT id, name from domain where name = #{name}")
    Domain findByName(String name);

    @Insert("INSERT INTO domain (name, desc) VALUES (#{name}, #{desc})")
    int create(Domain domain);

    @Select("SELECT")
    List<Middleware> findMiddlewareByDomain();

}
