package com.arzds.impl;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(50)
public class ApplicationRunnerImpl implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Arrays.asList(args.getSourceArgs()));
		System.out.println(args.getNonOptionArgs());
		System.out.println(args.getOptionNames());
		System.out.println(args.getOptionValues("name"));
		System.out.println(args.containsOption("bye"));
		System.out.println("Hello Application Runner");
	}

}
