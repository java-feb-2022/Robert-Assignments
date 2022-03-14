package com.codingdojo.loginRegistration.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class LoginUser {
	@NotBlank
	@Min(value = 3)
	private String userName;
	public String getUserName() { return userName; }
	public void setUserName(String userName) { this.userName = userName; }
	
	@NotBlank
	@Min(value = 8)
	private String password;
	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }
}
