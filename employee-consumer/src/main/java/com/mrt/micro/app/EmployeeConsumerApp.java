package com.mrt.micro.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mrt.micro.app.controller.EmployeeConsumer;

@SpringBootApplication
public class EmployeeConsumerApp {
	public static void main(String[] args) throws Exception{
		ApplicationContext ctx=SpringApplication.run(EmployeeConsumerApp.class, args);
		EmployeeConsumer ec=ctx.getBean(EmployeeConsumer.class);
		ec.getEmployee();
		}
	
}
