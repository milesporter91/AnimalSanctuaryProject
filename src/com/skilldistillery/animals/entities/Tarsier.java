package com.skilldistillery.animals.entities;

public class Tarsier extends Animal {
	private static String noise = "Wheeeeeeeet!";
	private String favoriteFood = "grasshoppers";
	
	public Tarsier(String name) {
		super();
		setName(name);
	}
		
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	@Override
	public void eat(int amount) {
		System.out.println("Tseep! *eating " + amount + " " + favoriteFood + "* Tseep!");
	}
	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
}
