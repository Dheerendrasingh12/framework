package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.arzds.controller.HelloController;

@SpringBootApplication
@ImportResource("classpath:/spring-config.xml")
public class ArzDsCoreConcept {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ArzDsCoreConcept.class, args);
		HelloController controller = (HelloController) ctx.getBean("helloController");
		controller.show();
	}
}
