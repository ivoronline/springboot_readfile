package com.ivoronline.springboot_readfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import java.io.File;
import java.nio.file.Files;

@Component
public class MyRunner implements CommandLineRunner {

  //PROPERTIES
  @Value("classpath:Test.txt") Resource           resource1;              //For file: and url:.
  @Autowired                   ResourceLoader     resourceLoader;         //lazily load Resource
  @Autowired                   ApplicationContext applicationContext;

  //=====================================================================================
  // RUN
  //=====================================================================================
  @Override
  public void run(String... args) throws Exception {

    //GET RESOURCE
    Resource resource2 = new ClassPathResource("Test.txt");
    Resource resource3 = resourceLoader    .getResource("classpath:Test.txt");
    Resource resource4 = applicationContext.getResource("classpath:Test.txt");

    //READ FILE
    File   file    = resource1.getFile();
    String content = new String(Files.readAllBytes(file.toPath()));

    //DISPLAY VALUES
    System.out.println(file);     //C:\Projects\springboot_readfile\target\classes\Test.txt
    System.out.println(content);  //Hello from Test.txt

  }

}
