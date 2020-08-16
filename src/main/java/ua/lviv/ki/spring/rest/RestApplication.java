package ua.lviv.ki.spring.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"ua.lviv.ki.spring.dataaccess","ua.lviv.ki.spring.service","ua.lviv.ki.spring.rest.controller"})
@EntityScan({"ua.lviv.ki.model"})
@EnableJpaRepositories({"ua.lviv.ki.spring.dataaccess"})
public class RestApplication {

  public static void main(String[] args) {
    SpringApplication.run(RestApplication.class, args);
  }

}
