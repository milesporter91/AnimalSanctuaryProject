package com.skilldistillery.animals.entities;

public class SilverbackGorilla extends Animal {
	private static String species = "Silverback Gorilla";
	private static String noise = "THUMP THUMP THUMP \n HOO HOO HOO";
	
	
	
	
	public SilverbackGorilla(String name) {
		super();
		setName(name);
	}
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	@Override
	public void eat(int amount) {
		System.out.println("HOO HOO *eating " + amount + " bamboo shoots* HOO HOO");
	}
	public String getSpecies() {
		return species;
	}
	
	

}
