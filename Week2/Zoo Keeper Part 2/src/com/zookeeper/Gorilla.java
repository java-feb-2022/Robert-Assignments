package com.zookeeper;

public class Gorilla extends Mammal{

	public Gorilla(int energy) {
		super("Gorilla", energy);
	}
	
	public void throwSomething() {
		System.out.printf("%s Throw!!!\n", super.getMammalName());
		super.spendEnergy(5);
	}
	public void eatBananas() {
		System.out.println("Nom Nom");
		super.gainEnergy(10);
	}
	public void climb() {
		System.out.println("Going King Kong up in here!!!");
		super.spendEnergy(10);
	}
}
