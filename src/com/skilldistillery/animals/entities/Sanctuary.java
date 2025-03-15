package com.skilldistillery.animals.entities;

public class Sanctuary {
	
	private Animal[] animals = new Animal[5];
	private Attendant attendant = new Attendant();
	private boolean enclosureFull = true;
	
	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}
	
	public void listAnimals() {
		for (int i = 0; i < animals.length; i++) {
			if (! animals[i].equals(null)) {
				System.out.println("This here is " + animals[i].getName() + ", a " 
			+ animals[i].getSpecies() + "!");
			}
			else {
				System.out.println("This enclosure is empty for now, but we're always "
						+ "lookin to help more animals in need!");
			}
		}
	}

	public void addAnimal(Animal animal) {
		checkVacancy();
		if (enclosureFull = true) {
			System.out.println("Sorry friend, but we don't "
					+ "currently have any empty enclosures!");
		} else {
			for (int i = 0; i < animals.length; i++) {
				if (animals[i].equals(null)) {
					animals[i] = animal;
					int enclosureNumber = i + 1;
					System.out.println("We got space for " + animal.getName() + " in enclosure #" 
							+ enclosureNumber + "! Feel free to check in anytime!");
					break;
				} 
			}
		}
	}
		
	public boolean checkVacancy() {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i].equals(null)) {
				enclosureFull = false;
				break;
			}
		}
		return enclosureFull;
	}

	public void startAttendantRounds() {
		attendant.makeRounds(animals);
	}


}