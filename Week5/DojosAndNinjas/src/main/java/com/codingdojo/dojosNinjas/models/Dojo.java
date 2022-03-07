package com.codingdojo.dojosNinjas.models;

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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "dojos")
public class Dojo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	
	@NotNull
	@NotBlank
	private String name;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
//	Dojo has many Ninjas
	@OneToMany(mappedBy = "dojo", fetch = FetchType.LAZY)
	private List<Ninja> ninjas;
	public List<Ninja> getNinjas() { return ninjas; }
	public void setNinjas(List<Ninja> ninjas) { this.ninjas = ninjas; }
	
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
	
	public Dojo() {
		
	}
}
