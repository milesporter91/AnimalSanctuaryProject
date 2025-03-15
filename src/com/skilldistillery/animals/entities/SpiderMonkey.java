package com.skilldistillery.animals.entities;

public class SpiderMonkey extends Animal {
	private static String species = "Spider Monkey";
	private static String noise = "EEK AHH AHH EEK!";
	
	
	public SpiderMonkey(String name) {
		super();
		setName(name);
	}
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	@Override
	public void eat(int amount) {
		System.out.println("Ch-ch-ch-ch-ch *eating " + amount + " mangos* Ch-ch-ch-ch-ch");
	}
	public String getSpecies() {
		return species;
	}
	
	
	
}
