package com.arzds.service;

import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

public class JsonServiceDetail {
	private Object requestData;
	private String requestString;
	private String responseString;
	private HttpMethod method;
	private String serviceUrl;
	private String serviceName;
	private HttpHeaders headers;
	private boolean xmlRequest;
	private Map<String, String> queryParam;
	private Map<String, String> pathParam;

	public Object getRequestData() {
		return requestData;
	}

	public void setRequestData(Object requestData) {
		this.requestData = requestData;
	}

	public String getRequestString() {
		return requestString;
	}

	public void setRequestString(String requestString) {
		this.requestString = requestString;
	}

	public String getResponseString() {
		return responseString;
	}

	public void setResponseString(String responseString) {
		this.responseString = responseString;
	}

	public HttpMethod getMethod() {
		return method;
	}

	public void setMethod(HttpMethod method) {
		this.method = method;
	}

	public String getServiceUrl() {
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public HttpHeaders getHeaders() {
		return headers;
	}

	public void setHeaders(HttpHeaders headers) {
		this.headers = headers;
	}

	public boolean isXmlRequest() {
		return xmlRequest;
	}

	public void setXmlRequest(boolean xmlRequest) {
		this.xmlRequest = xmlRequest;
	}

	public Map<String, String> getQueryParam() {
		return queryParam;
	}

	public void setQueryParam(Map<String, String> queryParam) {
		this.queryParam = queryParam;
	}

	public Map<String, String> getPathParam() {
		return pathParam;
	}

	public void setPathParam(Map<String, String> pathParam) {
		this.pathParam = pathParam;
	}

}
