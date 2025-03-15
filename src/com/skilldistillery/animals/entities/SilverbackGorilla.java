package com.skilldistillery.animals.entities;

public class SilverbackGorilla extends Animal {
	private static String noise = "THUMP THUMP THUMP \n HOO HOO HOO";
	private String favoriteFood = "bamboo shoots";
	
	public SilverbackGorilla(String name) {
//		super();
		setName(name);
	}
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	@Override
	public void eat(int amount) {
		System.out.println("HOO HOO *eating " + amount + " " + favoriteFood + "* HOO HOO");
	}
	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	
	

}
