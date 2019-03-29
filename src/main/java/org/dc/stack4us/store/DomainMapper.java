package org.dc.stack4us.store;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Lang;
import org.apache.ibatis.annotations.Select;
import org.dc.stack4us.domain.Domain;
import org.dc.stack4us.util.ListParamLauguageDriver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DomainMapper {
    @Select("SELECT id, name from domain")
    List<Domain> list();

    @Select("SELECT id, name from domain where id = #{id}")
    Domain get(Long id);

    @Lang(ListParamLauguageDriver.class)
    @Select("SELECT id, name from domain where id in (#{ids})")
    List<Domain> getSome(List<Long> ids);

    @Select("SELECT id, name from domain where name = #{name}")
    Domain findByName(String name);

    @Insert("INSERT INTO domain (name, desc) VALUES (#{name}, #{desc})")
    int create(Domain domain);

    @Select("SELECT stack_id from domain_stack_relation.sql where domain_id = #{id}")
    List<Long> findStackIdByDomainId(Long id);
}
