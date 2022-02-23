package com.codingdojo.fruityLoops.models;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Fruit {
//	Variables with Getters and Setters
	private String name;
	public String getName() { return name; }
	public void setName(String givenName) { name = givenName; }
	
	private double price;
	public double getPrice() { return price; }
	public void setPrice(int givenPrice) { price = givenPrice; }
	
//	Static Variables with only Getter
	private static ArrayList<Fruit> allFruits = new ArrayList<Fruit>();
	public static ArrayList<Fruit> getFruits() { return allFruits; }
	
//	Instance Methods
	public Fruit(String name, double price) {
		this.name = name;
		this.price = price;
		allFruits.add(this);
	}
}
