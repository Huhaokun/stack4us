package org.dc.stack4us;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.dc.stack4us.store")
public class Stack4usApplication {

  public static void main(String[] args) {
    SpringApplication.run(Stack4usApplication.class, args);
  }

}

