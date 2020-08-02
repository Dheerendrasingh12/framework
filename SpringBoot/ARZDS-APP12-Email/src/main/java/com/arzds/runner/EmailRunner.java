package com.arzds.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import com.arzds.service.EmailService;

@Component
public class EmailRunner implements CommandLineRunner {
	@Autowired
	private EmailService emailService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		FileSystemResource fileSystemResource = new FileSystemResource("F:\\key.pdf");

		boolean flag = emailService.send("Dheerendrasingh12@gmail.com", "Email Service Test", "ARZDS",
				null, null, null);
		if (flag)
			System.out.println("Sucessfully Sent");
		else
			System.out.println("Sent Failed");
	}

}
