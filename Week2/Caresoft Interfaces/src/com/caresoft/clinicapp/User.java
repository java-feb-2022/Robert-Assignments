package com.caresoft.clinicapp;

public class User {
    protected Integer id;
    public Integer id() { return this.id; }
    
    protected int pin;
    public int pin() { return pin; }
    
    private static int idCount = 1;

//    Adjusted how id works so that Id is automatically assigned to ensure no two people have the same ID
	public User() {
		id = idCount;
		idCount++;
	}

}
