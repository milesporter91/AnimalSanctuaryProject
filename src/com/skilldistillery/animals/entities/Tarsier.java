package com.skilldistillery.animals.entities;

public class Tarsier extends Animal {
	private static String noise = "Wheeeeeeeet!";
	
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	@Override
	public void eat(int amount) {
		System.out.println("Tseep! *eating " + amount + " grasshoppers* Tseep!");
	}
}
