package com.uca.capas.clases;

public class User {
	private String name;
	private String pass;
	private String userType;
	
	public User(String name,String pass,String userType) {
		this.name=name;
		this.pass=pass;
		this.userType=userType;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	

}
