package org.dc.stack4us.domain;

import lombok.Data;

import java.util.List;

@Data
public class Stack {
  private Long id;
  private String name;
  private String githubUrl;
  private String officialUrl;
  private Integer starNum;
  private String desc;
  private List<Tag> tags;
  private String icon;

  @Override
  public String toString() {
    return id + ", " + name + ", " + githubUrl + ", " + starNum;
  }
}
