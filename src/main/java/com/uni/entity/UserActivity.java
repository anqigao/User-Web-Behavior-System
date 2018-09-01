package com.uni.entity;

import java.util.Date;

public class UserActivity {
	
	private int id;
	private String url;
	private Date time;

	//getter and setter
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUrl() {
		return this.url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Date getTime() {
		return this.time;
	}
	
	public void setTime(Date time) {
		this.time = time;
	}
}
