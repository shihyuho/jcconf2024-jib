package com.github.shihyuho.jcconf2024.jib;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@SpringBootApplication
public class JibApplication {

  public static void main(String[] args) {
    SpringApplication.run(JibApplication.class, args);
  }

  @GetMapping("/hello")
  public String hello() {
    log.info("Hello JCConf 2024!");
    return "Hello JCConf 2024!";
  }
}
