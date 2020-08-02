package com.arzds.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class MatchResponse {
@XmlElement(name = "MatchResult")
	private MatchResult matchResult;

public MatchResult getMatchResult() {
	return matchResult;
}

public void setMatchResult(MatchResult matchResult) {
	this.matchResult = matchResult;
}

@Override
public String toString() {
	return "MatchResponse [matchResult=" + matchResult + "]";
}

}
