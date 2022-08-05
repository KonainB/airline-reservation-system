package com.example.dto;

public class CustomerDTO {
	private int id;
	private String fName;
	private String lName;
	private String userName;
	private long phone;
	private String email;
	private String address;
	private String gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public CustomerDTO(int id, String fName, String lName, String userName, long phone, String email, String address,
			String gender) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.userName = userName;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.gender = gender;
	}
	public CustomerDTO() {
		super();
	}
	
}