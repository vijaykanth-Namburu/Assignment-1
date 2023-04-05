package com.assignment;

import java.util.Arrays;

import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Assignment1Application implements CommandLineRunner {
	
	@Autowired
	ApplicationContext applicationcontext;

	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);
	}
	
	
	
	public void run(String... arg0) throws Exception {
       String[] beans = applicationcontext.getBeanDefinitionNames();
        Arrays.sort(beans);
        for (String bean : beans) {
            System.out.println(bean);
        } 
		
		/*String[] beans = applicationcontext.getBeanDefinitionNames();
        for (String bean : beans) {
            System.out.println(bean);
        }*/
    }

}
