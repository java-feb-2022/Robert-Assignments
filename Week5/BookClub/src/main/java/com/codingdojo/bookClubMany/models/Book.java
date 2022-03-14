package com.codingdojo.bookClubMany.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	
	@NotEmpty
	private String title;
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	
	@NotEmpty
	private String author;
	public  String getAuthor() { return author; }
	public void setAuthor(String author) { this.author = author; }
	
	@NotEmpty
	private String userThoughts;
	public String getUserThoughts() { return userThoughts; }
	public void setUserThoughts(String userThoughts) { this.userThoughts = userThoughts; }
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
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
