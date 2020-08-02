package com.arzds.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket myDock() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.arzds.controller")).paths(PathSelectors.regex("/home.*"))
				.build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("ArzDs Swagger Project").description("Swagger Implementation for rest")
				.contact(new Contact("ArzDs", "https://github.com/Dheerendrasingh12/DsArz",
						"Dheerendrasingh12@gmail.com"))
				.license("Apache 2.0").licenseUrl("http://www.apache.org.licences/LICENSE-2.0.html").version("1.0")
				.build();
	}
}
