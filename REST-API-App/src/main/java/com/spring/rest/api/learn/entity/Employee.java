package com.spring.rest.api.learn.entity;

public class Employee {

	private long id;
	private String Name;
	private String email;
	private String address;
	private String contact;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Employee(long id, String name, String email, String address, String contact) {
		super();
		this.id = id;
		Name = name;
		this.email = email;
		this.address = address;
		this.contact = contact;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
