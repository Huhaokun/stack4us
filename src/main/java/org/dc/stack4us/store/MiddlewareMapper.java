package org.dc.stack4us.store;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.dc.stack4us.domain.Middleware;
import org.springframework.stereotype.Component;

@Component
public interface MiddlewareMapper {
  @Select("SELECT id, name, github_url, star_num FROM middleware where id = #{id}")
  Middleware get(Long id);

  @Select("SELECT id, name, github_url, star_num FROM middleware where name = #{name}")
  Middleware findByName(String name);

  @Insert("INSERT INTO middleware (name, github_url, star_num) VALUES (#{name}, #{githubUrl}, #{starNum})")
  int create(Middleware middleware);

  @Update("UPDATE middleware SET (name, github_url, star_num) VALUES (#{name}, #{githubUrl}, #{starNum})")
  int update(Middleware middleware);

  @Select("SELECT id, name, github_url, star_num FROM middleware")
  List<Middleware> list();
}
