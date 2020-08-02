package com.arzds.ARZDSJosnService;

import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

public class JsonServiceDetails {
private Object requestData;
private String requestString;
private Map<String, String> pathParam;
private Map<String, String> queryParam;
private String serviceUrl;
private HttpMethod method;
private HttpHeaders headers;
private boolean xmlRequest;
private HttpHeaders responseHeader;
private String responseBody;
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
public Map<String, String> getPathParam() {
	return pathParam;
}
public void setPathParam(Map<String, String> pathParam) {
	this.pathParam = pathParam;
}
public Map<String, String> getQueryParam() {
	return queryParam;
}
public void setQueryParam(Map<String, String> queryParam) {
	this.queryParam = queryParam;
}
public String getServiceUrl() {
	return serviceUrl;
}
public void setServiceUrl(String serviceUrl) {
	this.serviceUrl = serviceUrl;
}
public HttpMethod getMethod() {
	return method;
}
public void setMethod(HttpMethod method) {
	this.method = method;
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
public HttpHeaders getResponseHeader() {
	return responseHeader;
}
public void setResponseHeader(HttpHeaders responseHeader) {
	this.responseHeader = responseHeader;
}
public String getResponseBody() {
	return responseBody;
}
public void setResponseBody(String responseBody) {
	this.responseBody = responseBody;
}


}
