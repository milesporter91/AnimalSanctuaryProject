package com.skilldistillery.animals.entities;

public class SpiderMonkey extends Animal {
	private static String noise = "EEK AHH AHH EEK!";
	private  String favoriteFood = "mangos";
	
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
		System.out.println("Ch-ch-ch-ch-ch *eating " + amount + " " + favoriteFood + "* Ch-ch-ch-ch-ch");
	}
	
	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	
}
