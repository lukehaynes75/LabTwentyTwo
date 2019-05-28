package com.lab22.LabTwentyTwo;

public class UserProfile {
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String birthday;
	private String phone;
	
	
	public UserProfile() {
		super();
	}
	
	
	public UserProfile(String userName, String password, String firstName, String lastName, String email, String gender,
			String birthday, String phone) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "UserProfile userName = " + userName + ", password = " + password + ", firstName = " + firstName
				+ ", lastName = " + lastName + ", email = " + email + ", gender = " + gender + ", birthday = " + birthday;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	
}
