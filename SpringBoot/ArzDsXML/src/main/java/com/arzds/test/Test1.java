package com.arzds.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class Test1 {
	public static void main(String[] args) {
		try {
			XMLInputFactory xif = XMLInputFactory.newInstance();
			XMLStreamReader xsr = xif
					.createXMLStreamReader(new FileReader("G:/ProjectDocument/Piramal/Sample Response.txt"));
			xsr.nextTag(); // Advance to Envelope tag

			xsr.nextTag(); // Advance to Body tag
			xsr.nextTag();
			xsr.nextTag();

			JAXBContext jc = JAXBContext.newInstance(MatchResult.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			JAXBElement<MatchResult> je = unmarshaller.unmarshal(xsr, MatchResult.class);
			MatchResult matchResult = je.getValue();
			System.out.println(je.getName());
			System.out.println(je.getValue());
		} catch (XMLStreamException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
