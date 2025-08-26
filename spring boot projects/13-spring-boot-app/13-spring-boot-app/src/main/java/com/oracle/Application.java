package com.oracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //@SpringBootConfiguration+@EnableAutoConfiguration+@ComponentScan
public class Application {

	public static void main(String[] args) {
		  // initialize ApplicationContext (Spring container)
		  //Scan the class path
		  //it creates the neccessary bean instances
		  //starts the the tomcat server & deploy the app in tomcat
		  //return the ref of ApplicationContext
		SpringApplication.run(Application.class, args);
	}
}
