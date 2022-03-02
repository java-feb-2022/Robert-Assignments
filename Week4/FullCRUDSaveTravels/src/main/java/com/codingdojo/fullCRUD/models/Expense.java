package com.codingdojo.fullCRUD.models;

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
@Table(name="expenses")
public class Expense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	public long getId() { return id; }
	public void setId(long id) { this.id = id; }
	
	@NotNull
	@Size(min = 1, message = "Name must not be empty.")
	private String name;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	@NotNull
	@Size(min = 1, message = "Vendor name must not be empty")
	private String vendor;
	public String getVendor() { return vendor; }
	public void setVendor(String vendor) {this.vendor = vendor; }
	
	@NotNull
	@Min(value = 1, message = "Amount cannot be negative")
	private double amount;
	public double getAmount() { return amount; }
	public void setAmount(double amount) {this.amount = amount; }
	
	@NotNull
	@Size(min = 1, message = "Please provide brief description.")
	public String description;
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date created_at;
	public Date getCreatedAt() { return created_at; }
	
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updated_at;
	public Date getUpdatedAt() { return updated_at; }
	
	public Expense() {
		
	}
	
	public Expense(String name, String vendor, double amount, String descritpion) {
		this.name = name;
		this.vendor = vendor;
		this.amount = amount;
		this.description = descritpion;
	}
	
	@PrePersist
	protected void onCreate() { this.created_at = new Date(); }
	
	@PreUpdate
	protected void onUpdate() { this.updated_at = new Date(); }

}
