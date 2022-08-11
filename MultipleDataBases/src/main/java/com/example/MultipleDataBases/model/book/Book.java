package com.example.MultipleDataBases.model.book;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
@Id
private int id;
private String name;

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
public Book(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Book() {
	// TODO Auto-generated constructor stub
}
}
