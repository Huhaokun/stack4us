package org.dc.stack4us.domain;

import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Glossary {
  private Long id;
  private String name;
  private String desc;
  private Timestamp createTime;
  private Timestamp updateTime;
}
