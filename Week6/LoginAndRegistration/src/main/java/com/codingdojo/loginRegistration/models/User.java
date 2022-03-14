package com.codingdojo.loginRegistration.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	
	@NotBlank
	@Min(value = 3)
	private String userName;
	public String getUserName() { return userName; }
	public void setUserName(String userName) { this.userName = userName; }
	
	@NotBlank
	@Email
	private String email;
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	
	@NotBlank
	@Min(value = 8)
	private String password;
	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }
	
	@Transient
	@NotEmpty
	@Min(value = 8)
	private String confirm;
	public String getConfirm() { return confirm; }
	public void setConfirm(String confirm) { this.confirm = confirm; }
	
//	Created at and Updated at Skipped becuase not necessary for this excercise
}
