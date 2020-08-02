package com.arzds.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class ResultBlock {
	@XmlElement(name = "MatchSummary")
	private MatchSummary matchSummary;

	public MatchSummary getMatchSummary() {
		return matchSummary;
	}

	public void setMatchSummary(MatchSummary matchSummary) {
		this.matchSummary = matchSummary;
	}

	@Override
	public String toString() {
		return "ResultBlock [matchSummary=" + matchSummary + "]";
	}

}
