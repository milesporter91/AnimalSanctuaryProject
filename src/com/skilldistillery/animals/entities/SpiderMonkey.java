package com.skilldistillery.animals.entities;

public class SpiderMonkey extends Animal {
	private String species = "Spider Monkey";
	private static String noise = "EEK AHH AHH EEK!";
	
	
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
	public void setSpecies(String species) {
		this.species = species;
	}
	
	
	
}
