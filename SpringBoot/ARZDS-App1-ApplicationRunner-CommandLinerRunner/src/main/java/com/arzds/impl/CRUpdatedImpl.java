package com.arzds.impl;

import java.util.List;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@ConfigurationProperties("my.arzds")
@Component
@Order(55)
public class CRUpdatedImpl implements CommandLineRunner {
	private int id;
	private String value;
	
	private List<String> ldata;
	private Set<String> mdata;

	public CRUpdatedImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CRUpdatedImpl [id=" + id + ", value=" + value + ", ldata=" + ldata + ", mdata=" + mdata + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<String> getLdata() {
		return ldata;
	}

	public void setLdata(List<String> ldata) {
		this.ldata = ldata;
	}

	public Set<String> getMdata() {
		return mdata;
	}

	public void setMdata(Set<String> mdata) {
		this.mdata = mdata;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.toString());

	}

}
