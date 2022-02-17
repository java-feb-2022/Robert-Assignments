package com.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		super("Bat", 300);
	}
	
	public void fly() {
		System.out.println("WOOOSH!!!");
		super.spendEnergy(50);
	}
	public void eatHumans() {
		System.out.println("Nom CRUNCH Nom CRUNCH");
		super.gainEnergy(25);
	}
	public void attackTown() {
		System.out.println("AAAAAAAAAAAAHHHHHHHHHHH!!!!!!!!");
		super.spendEnergy(100);
	}
}
