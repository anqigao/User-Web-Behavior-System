package com.uni.entity;

import java.util.List;

public class UserInfo {
	
	private int id;
	private String lastName;
	private String firstName;
	private int age;
	
	private List<UserActivity> userActivity;
	
	//getter and setter
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String fname) {
		this.firstName = fname;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lname) {
		this.lastName = lname;
	}
	
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	public List<UserActivity> getActivity(){
		return userActivity;
	}
	
	public void setActivity(List<UserActivity> userActivity) {
		this.userActivity = userActivity;
	}
}
