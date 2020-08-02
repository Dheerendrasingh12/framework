package com.arzds.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.BufferOverflowException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.apache.bcel.internal.classfile.Field;

@Controller
public class HomeController {
	private static final String imgLocation = "/imgs";

	@RequestMapping("/uploadform")
	public ModelAndView uploadForm() {
		return new ModelAndView("uploadform");
	}

	@RequestMapping("/savefile")

	public ModelAndView saveImg(@RequestParam CommonsMultipartFile file, HttpSession httpSession) throws IOException {
		ServletContext context = httpSession.getServletContext();
		String path = context.getRealPath(imgLocation);
		String fileName = file.getOriginalFilename();
		System.out.println(path + " " + fileName);
		byte[] data = file.getBytes();
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
				new FileOutputStream(new File(path + File.separator + fileName)));
		bufferedOutputStream.write(data);
		bufferedOutputStream.flush();
		bufferedOutputStream.close();
		return new ModelAndView("uploadform", "filesuccess", "File successfully saved!");
	}
}
