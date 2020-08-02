package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.arzds.controller.HelloController;

@SpringBootApplication
@ImportResource("classpath:/spring-config.xml")
public class ArzDsSbCoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ArzDsSbCoreApplication.class, args);
		HelloController controller = ctx.getBean("helloController", HelloController.class);
		controller.show();
	}

}
