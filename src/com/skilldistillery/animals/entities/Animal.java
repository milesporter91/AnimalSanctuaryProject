package com.skilldistillery.animals.entities;

public class Animal {
	private String name;
	private String favoriteFood;
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
		System.out.println("***********INTERCOM ALARM*************");
		System.out.println("******THIS IS A RESTRICTED AREA*******");
		System.out.println("************TURN AROUND***************");
		System.out.println("************IMMEDIATELY***************");
	}
	
	public void eat(int amount) {
		System.out.println("Specimen#67924 is eating " + amount + " food items");
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

}
