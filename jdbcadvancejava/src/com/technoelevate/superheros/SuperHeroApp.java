package com.technoelevate.superheros;

import java.util.Scanner;

public class SuperHeroApp {

	public static void main(String[] args) {

		int choice;
		boolean flag = true;
		SuperHero hero = new SuperHero(2, "TankBund Shiva", "swiming", "Hands");
		SuperHero hero1 = new SuperHero(4, "Pl", "Not in My hands", "Making videos");
		Scanner sc = new Scanner(System.in);
		while (flag) {
			System.out.println("1 press 1 to insert hero");
			System.out.println("2 press 2 to delete hero");
			System.out.println("3 press 3 to update a hero");
			System.out.println("4 press 4 to display a hero");
			System.out.println("5 press 5 to exit SuperHeroApp");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				SuperHeroDAO.insertHero(hero1);
				break;
			case 2:
				SuperHeroDAO.deleteHero(hero);
				break;
			case 3:
				SuperHeroDAO.updateHero(hero);
				break;
			case 4:
				SuperHeroDAO.displayHero(hero);
			case 5:
				flag = false;
				System.out.println(" Thank you for using.. rate our application");
				break;

			}

		}

	}

}
