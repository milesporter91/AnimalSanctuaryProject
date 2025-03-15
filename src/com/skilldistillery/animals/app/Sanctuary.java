package com.skilldistillery.animals.app;

import com.skilldistillery.animals.entities.Animal;
import com.skilldistillery.animals.entities.Attendant;

public class Sanctuary {

	private Animal[] animals = new Animal[5];
	private Attendant attendant = new Attendant();

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	public void listAnimals() {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				System.out.println(
						"This here is " + animals[i].getName() + ", a " + animals[i].getClass().getSimpleName() + "!");
			} else {
				System.out.println(
						"This enclosure is empty for now, but we're always " 
				+ "lookin to help more animals in need!");
			}
		}
	}

	public void addAnimal(Animal animal) {
		if (checkVacancy()) {
			for (int i = 0; i < animals.length; i++) {
				if (animals[i] == null) {
					animals[i] = animal;
					int enclosureNumber = i + 1;
					System.out.println("We got space for " + animal.getName() + " in enclosure #" + enclosureNumber
							+ "! Feel free to check in anytime!");
					break;
				}
			}
		} 
	}

	public boolean checkVacancy() {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				return true;
			}
		}
		return false;
	}

	public void startAttendantRounds() {
		attendant.makeRounds(animals);
	}

}