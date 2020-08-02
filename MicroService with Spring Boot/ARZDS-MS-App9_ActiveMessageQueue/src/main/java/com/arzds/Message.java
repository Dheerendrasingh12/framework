package com.arzds;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable{
private Long id;
private String content;
private Date date;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
@Override
public String toString() {
	return "Message [id=" + id + ", content=" + content + "]";
}
public Message() {
	super();
	// TODO Auto-generated constructor stub
}
public Message(Long id, String content, Date date) {
	super();
	this.id = id;
	this.content = content;
	this.date = date;
}


}
