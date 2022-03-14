package com.codingdojo.bookClubMany.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	
	@NotEmpty
	private String userName;
	public String getUserName () { return userName; }
	public void setUserName(String userName) { this.userName = userName; }
	
	@NotEmpty
	@Email
	private String email;
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	
	@NotEmpty
	private String password;
	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }
	
	@NotEmpty
	@Transient
	private String confirm;
	public String getConfirm() { return confirm; }
	public void setConfirm(String confirm) { this.confirm = confirm; }
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Book> books;
	public List<Book> getBooks() { return books; }
	public void setBooks(List<Book> books) { this.books = books; }
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(updatable = false)
	private Date created_at;
	public Date getCreated_At() { return created_at; }
	@PrePersist
	public void setCreated_At() { this.created_at = new Date(); }
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updated_at;
	public Date getUpdated_At() { return updated_at; }
	@PreUpdate
	public void setUpdated_At() { this.updated_at = new Date(); }
}
