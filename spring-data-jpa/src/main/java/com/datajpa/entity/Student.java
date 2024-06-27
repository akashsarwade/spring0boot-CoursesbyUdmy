package com.datajpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private Long id;
	private String name;
	private int scoreTest;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScoreTest() {
		return scoreTest;
	}
	public void setScoreTest(int scoreTest) {
		this.scoreTest = scoreTest;
	}
	
	
	

}
