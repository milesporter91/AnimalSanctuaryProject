package com.skilldistillery.animals.entities;

public class Attendant {
	public void makeRounds(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			if (! animals[i].equals(null)) {
				System.out.println(animals[i].getName() + " is a " + animals[i].getClass() 
						+ " who LOVES bamboo stalks!");
				
			}
		}
	}
}
