package com.arzds.test;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "soap:Envelope")
public class HunterResponese {
	private SoapBody soapBody;

public SoapBody getSoapBody() {
	return soapBody;
}

public void setSoapBody(SoapBody soapBody) {
	this.soapBody = soapBody;
}


}
