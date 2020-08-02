package com.arzds.headparamTest;

import org.apache.commons.codec.binary.Base64;

public class CodecTest {
public static void main(String[] args) {
	String ds="Welcome to DsArz World";
	byte[] org=ds.getBytes();
	byte[] rev=Base64.encodeBase64(org);
	String str=new String(rev);
	System.out.println(str);
	byte[] dec=Base64.decodeBase64(rev);
	System.out.println(new String(dec));
}
}
