package com.arzds.service;

import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.arzds.model.Customer;

@ConfigurationProperties("my.prod")
@Component
public class CustomerData implements CommandLineRunner {
	@Autowired
	private Environment env;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(env.getProperty("server.port"));
		System.out.println(this);
	}

	private List<String> list;
	private Properties mdata;
	private Customer cust;

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Properties getMdata() {
		return mdata;
	}

	public void setMdata(Properties mdata) {
		this.mdata = mdata;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	@Override
	public String toString() {
		return "CustomerData [env=" + env + ", list=" + list + ", mdata=" + mdata + ", cust=" + cust + "]";
	}

}
