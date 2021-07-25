package Programs;

import java.util.Scanner;

enum TempratureUnit {
	CELCIUS,FAHRENHEIT,KELVIN;
}

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nTemperature Converter");
		System.out.println("---------------------\n");

		try {
			TempratureUnit t1 = null;
			System.out.println("Convert From: ");
			System.out.println("1. Celcius");
			System.out.println("2. Fahrenheit");
			System.out.println("3. Kelvin");
			System.out.print("Enter your choice: ");
			int convertFromChoice = sc.nextInt();
			switch(convertFromChoice) {
				case 1 -> {
					t1 = TempratureUnit.CELCIUS;
				}

				case 2 -> {
					t1 = TempratureUnit.FAHRENHEIT;
				}

				case 3 -> {
					t1 = TempratureUnit.KELVIN;
				}

				default -> {
					System.out.println("Enter your choice properly!");
					System.exit(0);
				}
			}

			TempratureUnit t2 = null;
			System.out.println("\nConvert To: ");
			if (t1.name().equalsIgnoreCase("Celcius")) {
				System.out.println("1. Fahrenheit");
				System.out.println("2. Kelvin");
				System.out.print("Enter your choice: ");
				int convertToChoice = sc.nextInt();
				switch(convertToChoice) {
					case 1 -> {
						t2 = TempratureUnit.FAHRENHEIT;
					}

					case 2 -> {
						t2 = TempratureUnit.KELVIN;
					}

					default -> {
						System.out.println("Enter your choice properly!");
						System.exit(0);
					}
				}
			} else if (t1.name().equalsIgnoreCase("Fahrenheit")) {
				System.out.println("1. Celcius");
				System.out.println("2. Kelvin");
				System.out.print("Enter your choice: ");
				int convertToChoice = sc.nextInt();
				switch(convertToChoice) {
					case 1 -> {
						t2 = TempratureUnit.CELCIUS;
					}

					case 2 -> {
						t2 = TempratureUnit.KELVIN;
					}

					default -> {
						System.out.println("Enter your choice properly!");
						System.exit(0);
					}
				}
			} else if (t1.name().equalsIgnoreCase("Kelvin")) {
				System.out.println("1. Celcius");
				System.out.println("2. Fahrenheit");
				System.out.print("Enter your choice: ");
				int convertToChoice = sc.nextInt();
				switch(convertToChoice) {
					case 1 -> {
						t2 = TempratureUnit.CELCIUS;
					}

					case 2 -> {
						t2 = TempratureUnit.FAHRENHEIT;
					}

					default -> {
						System.out.println("Enter your choice properly!");
						System.exit(0);
					}
				}
			} 

			System.out.println("\nConverting " + t1.name() + " -> " + t2.name() + " ...");
			System.out.print("\nEnter the temperature: ");
			float tempIn = sc.nextFloat();
			float tempOut;

			if (t1.name().equalsIgnoreCase("Celcius") && t2.name().equalsIgnoreCase("Fahrenheit")) {
				tempOut = ((tempIn*9)/5) + 32;
				System.out.println("\nSo, " + tempIn + "\u00B0C equals " + tempOut + "\u00B0F.");
			} else if (t1.name().equalsIgnoreCase("Fahrenheit") && t2.name().equalsIgnoreCase("Celcius")) {
				tempOut = ((tempIn - 32)*5)/9;
				System.out.println("\nSo, " + tempIn + "\u00B0F equals " + tempOut + "\u00B0C.");
			} else if (t1.name().equalsIgnoreCase("Celcius") && t2.name().equalsIgnoreCase("Kelvin")) {
				tempOut = tempIn + 273.15f;
				System.out.println("\nSo, " + tempIn + "\u00B0C equals " + tempOut + "K.");
			} else if (t1.name().equalsIgnoreCase("Kelvin") && t2.name().equalsIgnoreCase("Celcius")) {
				tempOut = tempIn - 273.15f;
				System.out.println("\nSo, " + tempIn + "K equals " + tempOut + "\u00B0C.");
			} else if (t1.name().equalsIgnoreCase("Fahrenheit") && t2.name().equalsIgnoreCase("Kelvin")) {
				tempOut = ((tempIn - 32)*5)/9 + 273.15f;
				System.out.println("\nSo, " + tempIn + "\u00B0F equals " + tempOut + "K.");
			} else if (t1.name().equalsIgnoreCase("Kelvin") && t2.name().equalsIgnoreCase("Fahrenheit")) {
				tempOut = ((tempIn - 273.15f)*9)/5 + 32;
				System.out.println("\nSo, " + tempIn + "K equals " + tempOut + "\u00B0F.");
			}
		} catch(Exception e) {
				System.out.println(e);
		}
	}
}