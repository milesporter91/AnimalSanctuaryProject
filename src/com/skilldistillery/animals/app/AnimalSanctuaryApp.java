package com.skilldistillery.animals.app;

import java.util.Scanner;

import com.skilldistillery.animals.entities.SilverbackGorilla;
import com.skilldistillery.animals.entities.SpiderMonkey;
import com.skilldistillery.animals.entities.Tarsier;

public class AnimalSanctuaryApp {

	public static void main(String[] args) {
		Sanctuary sanctuary;
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();
	}

	private void launchApp() {
		boolean sanctuaryTour = true;
		String guestDecision;
		Sanctuary sanctuary = new Sanctuary();
		Scanner kb = new Scanner(System.in);
		printGreeting();
		while (sanctuaryTour) {
			System.out.println("What can we do for you today?");
			System.out.println("1. List our current animals \t 2. Add an animal to our sanctuary "
					+ "\t 3. Take a guided tour \t 4. Exit");
			guestDecision = kb.next();
			switch (guestDecision) {
				case "1": case "List": {
					sanctuary.listAnimals();
					continue;
				}
				case "2": case "Add": {
					System.out.println("We would love to have your friend stay here! Please give us their name and species!");
					System.out.println("Name:");
					String name = kb.next();
					System.out.println("Species:");
					System.out.println("1. Silverback Gorilla \t 2. Spider Monkey \t 3. Tarsier");
					String speciesChoice = kb.next();
					switch (speciesChoice) {
						case "1": case "Silverback": case "Gorilla": {
							SilverbackGorilla newAnimal = new SilverbackGorilla(name);
							sanctuary.addAnimal(newAnimal);
							break;
						}
						case "2": case "Spider": case "Monkey": {
							SpiderMonkey newAnimal = new SpiderMonkey(name);
							sanctuary.addAnimal(newAnimal);
							break;
						}
						case "3": case "Tarsier": {
							Tarsier newAnimal = new Tarsier(name);
							sanctuary.addAnimal(newAnimal);
							break;
						}
						default: System.out.println("Sorry, but " + speciesChoice + "isn't an animal we can take care of here. "
								+ "Please choose from the options provided.");
					}
					continue;
				}
				case "3": case "Tour": case "tour": {
					sanctuary.startAttendantRounds();
					continue;
				}
				case "4": case "Exit": case "exit": {
					System.out.println("Have a great day! Come back any time!");
					sanctuaryTour = false;
					break;
				}
			}
		}
		kb.close();
		// TODO Instantiate a Sanctuary -done
		// TODO Instantiate an Attendant -done
		// TODO Add Attendant to Sanctuary -done
		// TODO Create and add Animals to Sanctuary - done
		// TODO Tell Sanctuary to start Attendant rounds
	}
		
		
	public static void printGreeting() {
		        System.out.println("****************************************");
		        System.out.println("*                                      *");
		        System.out.println("*       🐵   WELCOME TO   🐵           *");
		        System.out.println("*       THE PRIMATE SANCTUARY          *");
		        System.out.println("*    Home to rescued and thriving      *");
		        System.out.println("*      primates from all over!         *");
		        System.out.println("*                                      *");
		        System.out.println("****************************************");
		        System.out.println("          \\         /");
		        System.out.println("           \\🐵🐒🐵/");
		        System.out.println("            |  |  |");
		        System.out.println("            |  |  |");
	}
		    

}
