package org.dc.stack4us.store;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.dc.stack4us.domain.Glossary;
import org.springframework.stereotype.Component;

@Component
public interface GlossaryWrapper {
  @Select("SELECT id, name, desc, create_time, update_time FROM glossary where id = #{id}")
  Glossary get(Long id);

  @Select("SELECT id, name, desc, create_time, update_time FROM glossary where name = #{name}")
  Glossary findByName(String name);

  @Insert("INSERT INTO glossary(name, desc) VALUES (#{name}, #{desc})")
  int create(Glossary glossary);

  @Update("UPDATE glossary SET(name, desc) VALUES (#{name}, #{desc})")
  int update(Glossary glossary);

  @Delete("DELETE FROM glossary WHERE id = #{id}")
  int delete(Long id);

  @Select("SELECT id, name FROM glossary")
  List<Glossary> list();
}
