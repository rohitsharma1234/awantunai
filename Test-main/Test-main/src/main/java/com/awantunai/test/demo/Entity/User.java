package com.awantunai.test.demo.Entity;

import javax.persistence.Entity;

@Entity
public class  User {

@javax.persistence.Id
private Integer Id;

private String name;

private String email;

private String password;

public Integer getId() {
	return Id;
}

public void setId(Integer id) {
	Id = id;
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

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public EntityClassAwantunai(Integer id, String name, String email, String password) {
	super();
	Id = id;
	this.name = name;
	this.email = email;
	this.password = password;
}

@Override
public String toString() {
	return "EntityClass [Id=" + Id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
}


	
}
