package com.skilldistillery.animals.entities;

public class Animal {
	private String name;
	private String species;

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void makeNoise() {
		System.out.println("**crickets**");
	}
	
	public void eat(int amount) {
		System.out.println("I am eating " + amount + " foods");
	}
}
