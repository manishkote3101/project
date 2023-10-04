package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Users {
// This annotation is used to map the class to a table in the database.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private Integer price;
// Getters and setters for the fields.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getprice() {
		return price;
	}
	public void setStatus(Integer price) {
		this.price = price;
	}
	
}