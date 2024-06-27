package com.java.piller.inheritance.object;

public class Employee extends Person {

	private String employeeName;
	private String title;

	public Employee() {
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", title=" + title + "]";
	}

}
