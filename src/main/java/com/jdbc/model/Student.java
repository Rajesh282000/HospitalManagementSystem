package com.jdbc.model;

public class Student {
	private int id;
	private String name;
	private String email;
	private String pwd;
	private String dob;
	private String address;
	private String gender;
	private long phoneNumber;
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", pwd=" + pwd + ", dob=" + dob
				+ ", address=" + address + ", gender=" + gender + ", phoneNumber=" + phoneNumber + "]";
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

}
