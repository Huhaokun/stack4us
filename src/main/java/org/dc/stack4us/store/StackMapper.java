package org.dc.stack4us.store;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Lang;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.dc.stack4us.domain.Stack;
import org.dc.stack4us.util.ListParamLauguageDriver;
import org.springframework.stereotype.Component;

@Component
public interface StackMapper {
    @Select("SELECT * FROM stack where id = #{id}")
    Stack get(Long id);

    @Lang(ListParamLauguageDriver.class)
    @Select("SELECT * FROM stack where id in (#{ids})")
    List<Stack> getSome(List<Long> ids);

    @Select("SELECT id, name, github_url, star_num FROM stack where name = #{name}")
    Stack findByName(String name);

    @Insert("INSERT INTO stack (name, github_url, star_num) VALUES (#{name}, #{githubUrl}, #{starNum})")
    int create(Stack stack);

    @Update("UPDATE stack SET (name, github_url, star_num) VALUES (#{name}, #{githubUrl}, #{starNum})")
    int update(Stack stack);

    @Select("SELECT id, name, github_url, star_num FROM stack")
    List<Stack> list();

    @Select("SELECT domain_id FROM domain_stack_relation WHERE stack_id = #{id}")
    List<Long> findDomainIdByStackId(Long id);
}
