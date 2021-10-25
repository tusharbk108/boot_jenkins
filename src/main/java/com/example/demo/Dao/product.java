package com.example.demo.Dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class product {
	
	@Id
	private int id;
	private String name;
	private int prize;
	public int getId() {
		System.out.println(id);
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		System.out.println(name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrize() {
		System.out.println(prize);
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
	
	
	
}
