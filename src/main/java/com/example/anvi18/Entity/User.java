package com.example.anvi18.Entity;

public class User {
private String name;
private String id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String  getid() {
	return id;
}
public void setAge(String id) {
	this.id = id;
}
public User(String name,String id){
	this.name=name;
	this.id=id;
}
}
