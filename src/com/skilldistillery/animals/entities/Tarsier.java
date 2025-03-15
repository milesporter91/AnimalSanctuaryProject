package com.skilldistillery.animals.entities;

public class Tarsier extends Animal {
	private String species = "Tarsier";
	private static String noise = "Wheeeeeeeet!";
	
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	@Override
	public void eat(int amount) {
		System.out.println("Tseep! *eating " + amount + " grasshoppers* Tseep!");
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
}
