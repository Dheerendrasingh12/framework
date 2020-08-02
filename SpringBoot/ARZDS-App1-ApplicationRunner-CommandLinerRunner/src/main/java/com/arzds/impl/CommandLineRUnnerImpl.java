package com.arzds.impl;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Order(60)
public class CommandLineRUnnerImpl implements CommandLineRunner {
	@Value("${my.arzds.id}")
	private int id;
	@Value("${my.arzds.value}")
	private String name;
	@Value("${server.port}")
	private long port;

	@Override
	public String toString() {
		return "CommandLineRUnnerImpl [id=" + id + ", name=" + name + ", port=" + port + "]";
	}

	@Autowired
	private Environment env;

	@Override 
	public void run(String... args) throws Exception {
		/*
		 * System.out.println(args[1]); System.out.println(Arrays.asList(args));
		 * System.out.println("Hello CommandLiner");
		 * System.out.println(env.getProperty("my.arzds.value"));
		 * System.out.println(this.toString()); new Sample() { public void show() {
		 * System.out.println("Hello" + this.toString()); } };
		 * 
		 */	}

}
