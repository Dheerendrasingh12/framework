package com.arzds.runner;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@ConfigurationProperties("my.arzds")
@Component
@Order(60)
public class CommandLineRUnnerImpl implements CommandLineRunner {
	private int id;
	private String name;
	private long port;
	private List<String> listData;
	private Map<String, Long> mdata;

	public Map<String, Long> getMdata() {
		return mdata;
	}

	public void setMdata(Map<String, Long> mdata) {
		this.mdata = mdata;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPort() {
		return port;
	}

	public void setPort(long port) {
		this.port = port;
	}

	public List<String> getListData() {
		return listData;
	}

	public void setListData(List<String> listData) {
		this.listData = listData;
	}

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	

	@Autowired
	private Environment env;

	@Override
	public void run(String... args) throws Exception {

		System.out.println(this.toString());

	}

	@Override
	public String toString() {
		return "CommandLineRUnnerImpl [id=" + id + ", name=" + name + ", port=" + port + ", listData=" + listData
				+ ", mdata=" + mdata + ", env=" + env + "]";
	}
	

}
