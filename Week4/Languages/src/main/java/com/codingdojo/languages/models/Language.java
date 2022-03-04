package com.codingdojo.languages.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "languages")
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	
	@NotNull
	@Size(min = 2, max = 20, message = "Language name must be between 2 and 20 characters.")
	private String langName;
	public String getLangName() { return langName; }
	public void setLangName(String langName) { this.langName = langName; }
	
	@NotNull
	@Size(min = 2, max = 20, message = "Creator name must be between 2 and 20 characters.")
	private String creatorName;
	public String getCreatorName() { return creatorName; }
	public void setCreatorName(String creatorName) { this.creatorName = creatorName; }
	
	@NotNull
	@NotBlank(message = "Version Required.")
	private String version;
	public String getVersion() { return version; }
	public void setVersion(String version) { this.version = version; }
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	public Date getCreatedAt() { return createdAt; }
	@PrePersist
	protected void onCreate() { this.createdAt = new Date(); }
	
	@DateTimeFormat(pattern = "yyy-MM-dd")
	private Date updatedAt;
	public Date getUpdatedAt() { return updatedAt; }
	@PreUpdate
	protected void onUpdate() { this.updatedAt = new Date(); }
}
