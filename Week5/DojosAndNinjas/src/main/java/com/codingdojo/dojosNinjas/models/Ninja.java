package com.codingdojo.dojosNinjas.models;

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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "ninjas")
public class Ninja {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	
	@NotBlank
	private String firstName;
	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) { this.firstName = firstName; }
	
	@NotBlank
	private String lastName;
	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	
	@Positive
	private Integer age;
	public Integer getAge() { return age; }
	public void setAge(Integer age) { this.age = age; }
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dojo_id")
	private Dojo dojo;
	public Dojo getDojo() { return dojo; }
	public void setDojo(Dojo dojo) { this.dojo = dojo; }
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date created_at;
	public Date getCreated_At() { return created_at; }
	@PrePersist
	public void setCreated_At() { this.created_at = new Date(); }
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updated_at;
	public Date getUpdated_At() { return updated_at; }
	@PreUpdate
	public void setUpdated_At() { this.updated_at = new Date(); }
	
	public Ninja() {
		
	}
}
