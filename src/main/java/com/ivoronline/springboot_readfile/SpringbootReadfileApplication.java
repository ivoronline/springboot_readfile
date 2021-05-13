package com.ivoronline.springboot_readfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class SpringbootReadfileApplication {

  public static void main(String[] args) throws IOException {
    SpringApplication.run(SpringbootReadfileApplication.class, args);
  }

}
