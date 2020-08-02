package com.arzds.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class MatchResult {
	@XmlElement(name = "ResultBlock")
private ResultBlock resultBlock;

	public ResultBlock getResultBlock() {
		return resultBlock;
	}

	public void setResultBlock(ResultBlock resultBlock) {
		this.resultBlock = resultBlock;
	}

	@Override
	public String toString() {
		return "MatchResult [resultBlock=" + resultBlock + "]";
	}
	
}
