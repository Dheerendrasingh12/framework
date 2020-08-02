package com.arzds.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name ="soap:Body")
public class SoapBody {
	@XmlElement(name = "MatchResponse")
private MatchResponse matchResponse;

	public MatchResponse getMatchResponse() {
		return matchResponse;
	}

	public void setMatchResponse(MatchResponse matchResponse) {
		this.matchResponse = matchResponse;
	}

	@Override
	public String toString() {
		return "SoapBody [matchResponse=" + matchResponse + "]";
	}
	
	
}
