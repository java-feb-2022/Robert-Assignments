package com.codingdojo.bookClubMany.models;

import javax.validation.constraints.NotEmpty;

public class LoginUser {
	@NotEmpty
	private String email;
	public String getEmail() { return email; }
	public void setEmail(String userName) { this.email = userName; }
	
	@NotEmpty
	private String password;
	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }
}
