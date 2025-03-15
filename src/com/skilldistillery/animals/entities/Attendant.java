package com.skilldistillery.animals.entities;

public class Attendant {
	public void makeRounds(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				System.out.println(animals[i].getName() + " is a " + animals[i].getClass().getSimpleName() 
						+ " who LOVES " + animals[i].getFavoriteFood() + "! \n");
				animals[i].makeNoise();
				System.out.println();
				animals[i].eat((int)(Math.random() * 10 + 1));
				System.out.println("---------------------------------------------------------------");
			} 
//			else {
//				System.out.println("This enclosure is empty for now! Let us know if you find "
//						+ "any primates out there!");
//			}
		}
		System.out.println("Woo! All done for now! Time to take a break! \n");
	}
}
