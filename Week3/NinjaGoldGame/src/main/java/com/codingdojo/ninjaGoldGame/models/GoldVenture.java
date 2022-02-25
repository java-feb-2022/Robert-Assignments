package com.codingdojo.ninjaGoldGame.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Date;

public class GoldVenture {
	private String ventureName;
	public String getName() {return ventureName; }
	
	private int minEarn;
	private int maxEarn;
	
	Random rand = new Random();
	
	private static HashMap<String, GoldVenture> ventures = new HashMap<String, GoldVenture>();
	public static HashMap<String, GoldVenture> getVentures() { return ventures; }

	private static ArrayList<String> ventureLogs = new ArrayList<String>();
	public static ArrayList<String> getLogs(){ return ventureLogs; }
	 public GoldVenture(int min, int max) {
		 minEarn = min;
		 maxEarn = max;
	}
	 
	 public int commitVenture(int currentGold, String location) {
		 int earnedAmount = rand.nextInt(minEarn, maxEarn + 1);
		 currentGold+= earnedAmount;
		 createLog(location, earnedAmount);
		 return currentGold;
	 }
	 
	 private void createLog(String location, int amount) {
		 ventureLogs.add("You entered a " + location + " and " + (amount > 0? "earned " + amount : "lost " + (amount * -1)) + " gold. (" + new Date() + ")");
	 }
}
