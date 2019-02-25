package org.dc.stack4us.domain;

import lombok.Data;

@Data
public class Middleware {
  private Long id;
  private String name;
  private String githubUrl;
  private Integer starNum;

  @Override
  public String toString() {
    return id + ", " + name + ", " + githubUrl + ", " + starNum;
  }
}
