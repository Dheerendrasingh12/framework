package com.arzds.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RandomData implements CommandLineRunner {
	@Value("${my.data.name}")
	private String value;
	@Value("${my.rnd.num.arr-from-to}")
	private int num;
	@Value("${my.rnd.bignum}")
	private long bigNum;
	@Value("${my.names}")
	private ArrayList<String> arr;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println(value);
		System.out.println(arr);
		setValue("ArzDs");
		setNum(100);
		setBigNum(50421);
		System.out.println(this);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public long getBigNum() {
		return bigNum;
	}

	public void setBigNum(long bigNum) {
		this.bigNum = bigNum;
	}

	@Override
	public String toString() {
		return "RandomData [value=" + value + ", num=" + num + ", bigNum=" + bigNum + "]";
	}

}
