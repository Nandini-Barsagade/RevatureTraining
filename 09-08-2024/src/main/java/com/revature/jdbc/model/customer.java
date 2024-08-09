package com.revature.jdbc.model;

public class customer {
private int id;
private String name;
private String email;
private String userName;
public customer() {
	super();
}
public customer(int id, String name, String email, String userName) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.userName = userName;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
@Override
public String toString() {
	return "Contacts [id=" + id + ", name=" + name + ", email=" + email + ", userName=" + userName + "]";
}

}