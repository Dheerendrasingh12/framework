package com.arzds.test;

import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class Test {
	public static String readFileAsString(String fileName) throws Exception {
		String data = "";
		data = new String(Files.readAllBytes(Paths.get(fileName)));
		getXMLResponse(data, MatchResult.class);
		return data;

	}

	@SuppressWarnings("unchecked")
	public static MatchResult getXMLResponse(String content, Class<MatchResult> valueType) {
		MatchResult resp = null;
		StringReader sr = new StringReader(content);
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(valueType);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			resp = (MatchResult) unmarshaller.unmarshal(sr);
		} catch (Exception e) {
			System.out.println(e);
		}
		return resp;
	}

	public static void main(String[] args) throws Exception {
		String data = readFileAsString("G:/ProjectDocument/Piramal/Sample Response.txt");
		System.out.println(data);
	}
}
