package com.spring.reactive.model;

public class Patient {

	private String firstName;
	private String lasstName;
	private String ssn;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasstName() {
		return lasstName;
	}

	public void setLasstName(String lasstName) {
		this.lasstName = lasstName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Patient(String firstName, String lasstName, String ssn) {

		this.firstName = firstName;
		this.lasstName = lasstName;
		this.ssn = ssn;
	}

}
