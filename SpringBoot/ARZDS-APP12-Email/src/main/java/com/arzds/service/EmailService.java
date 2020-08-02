package com.arzds.service;

import javax.mail.internet.MimeMessage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
	@Autowired
	private JavaMailSender javaMailSender;
	Logger log = LogManager.getLogger(EmailService.class);

	public boolean send(String to, String subject, String text, FileSystemResource fileSystemResource, String[] cc,
			String[] bcc) {
		boolean flag = false;
		try {
//Create Mime Obj
			MimeMessage message = javaMailSender.createMimeMessage();
//Helper class
			MimeMessageHelper helper = new MimeMessageHelper(message, fileSystemResource != null ? true : false);
			helper.setTo(to);
			helper.setFrom("Dheerendrasingh1212@gmail.com");
			helper.setSubject(subject);
			helper.setText(text);
			if (fileSystemResource != null)
				helper.addAttachment(fileSystemResource.getFilename(), fileSystemResource);

			javaMailSender.send(message);
			flag = true;
		} catch (Exception e) {
			log.error(e);
		}
		return flag;
	}
}
