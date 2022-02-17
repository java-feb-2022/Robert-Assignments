package com.zookeeper;



public class Mammal {
//	Variables with their strict Getters and Setters
	private String mammalName;
	public String getMammalName() { return mammalName; }
	
	private int energyLevel;
	public int getEnergy() { return energyLevel; }
	
//	Other Methods That do more than strict Get and Set
	
	public Mammal(String name, int energy) {
		mammalName = name;
		energyLevel = energy;
	}
	
	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
	
	public void spendEnergy(int energySpent) {
//		Maybe check to ensure energy does not go below 0 for Future implementation
		energyLevel-= energySpent;
	}
	public void gainEnergy(int energyGiven) {
//		Potential for maxEnergy variable so and similar check for spendEnergy()
		energyLevel+= energyGiven;
	}
}