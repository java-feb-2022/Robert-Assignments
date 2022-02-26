package com.codingdojo.booksAPI.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="books")
public class Book {	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	public long getId() { return id; }
	
	@NotNull
	@Size(min = 5, max = 200)
	private String title;
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	
	@NotNull
	@Size(min = 5, max = 200)
	private String description;
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	
	@NotNull
	@Size(min = 3, max = 40)
	private String language;
	public String getLanguage() { return language; }
	public void setLanguage(String language) { this.language = language; }
	
	@NotNull
	@Min(100)
	private Integer numOfPages;
	public Integer getPages() { return numOfPages; }
	public void setPages(Integer numOfPages) { this.numOfPages = numOfPages; }
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyy-MM-dd")
	private Date createdAt;
	public Date getCreatedAt() { return createdAt; }
	
	@DateTimeFormat(pattern = "yyy-MM-dd")
	private Date updatedAt;
	public Date getUpdatedAt() { return updatedAt; }
	
//	Constructors
	
	public Book() {
		
	}
	
	public Book(String title, String desc, String lang, int pages) {
		this.title = title;
		this.description = desc;
		this.language = lang;
		this.numOfPages = pages;
	}
	
//	Other Methods
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
}
