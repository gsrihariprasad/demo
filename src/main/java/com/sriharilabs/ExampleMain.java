package com.sriharilabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExampleMain {

  public static void main(String[] args) throws InterruptedException {
//      SpringApplication sa = new SpringApplication(ExampleMain.class);
//      ConfigurableApplicationContext context = sa.run(args);
//      MyBean bean = context.getBean(MyBean.class);
//      bean.doSomething();
	  SpringApplication.run(ExampleMain.class);
  }
}