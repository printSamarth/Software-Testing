package com.example.calculator;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Calculator do you want ?");
		System.out.println("Enter 1 for Scientific calculators and 2 for Fitness Calculators");
		int choiceCal = sc.nextInt();
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		Main bmiDriver = new Main();
		if (choiceCal == 1) {
			scientificCalculator.scientificDriver();
		}
		else{
			bmiDriver.bmiDriver();
		}
    }
	public void bmiDriver(){
		Scanner sc = new Scanner(System.in);
		int choice = getCalcChoice();
		while (choice != 7) {
			switch (choice) {
				case 1:
					System.out.println("Enter your height in meter: ");
					double height = sc.nextDouble();
					System.out.println("Enter your weight in kg: ");
					double weight = sc.nextDouble();
					System.out.println(new BmiCalculator().calculate(height, weight));
					System.out.println();
					break;
				case 2:
					System.out.println("Age (15-80): ");
					int age = sc.nextInt();
					System.out.println("Gender (M/F): ");
					char gender = sc.next().charAt(0);
					System.out.println("Height (cm): ");
					double h = sc.nextDouble();
					System.out.println("Weight (kg): ");
					double w = sc.nextDouble();
					System.out.println(new BmrCalculator().calculate(age, gender, h, w));
					System.out.println();
					break;
				case 3:
					System.out.println("Gender (M/F): ");
					gender = sc.next().charAt(0);
					System.out.println("Age (15-80): ");
					age = sc.nextInt();
					System.out.println("Height (cm): ");
					h = sc.nextDouble();
					System.out.println("Weight (kg): ");
					w = sc.nextDouble();
					System.out.println("Neck (cm): ");
					double neck = sc.nextDouble();
					System.out.println("Waist (cm): ");
					double waist = sc.nextDouble();
					System.out.println("Hip (cm): ");
					double hip = sc.nextDouble();
					System.out.println(new BodyFatCalculator().calculate(gender, w, h, neck, waist, hip));
					System.out.println();
					break;
				case 4:
					System.out.println("Age (15-80): ");
					age = sc.nextInt();
					System.out.println("Gender (M/F): ");
					gender = sc.next().charAt(0);
					System.out.println("Height (cm): ");
					h = sc.nextDouble();
					System.out.println("Weight (kg): ");
					w = sc.nextDouble();
					System.out.println("Activity Level: ");
					System.out.println("1. Little to no exercise ");
					System.out.println("2. Light exercise (1–3 days per week)");
					System.out.println("3. Moderate exercise (3–5 days per week)");
					System.out.println("4. Heavy exercise (6–7 days per week)");
					System.out.println("5. Very heavy exercise (twice per day, extra heavy workouts)");
					System.out.print("Enter your choice: ");
					int activity = sc.nextInt();
					System.out.println(new CalorieCalculator().calculate(age, gender, h, w, activity));
					System.out.println();
					break;
				case 5:
					System.out.println("Age (2-80): ");
					int age1 = sc.nextInt();
					System.out.println("Gender (M/F): ");
					char gender1 = sc.next().charAt(0);
					System.out.println("Height (in cm): ");
					double height1 = sc.nextDouble();
					System.out.println(new IdealWeightCalculator().calculate(age1, gender1, height1));
					System.out.println();
					break;
				case 6:
					System.out.println("Gender (M/F): ");
					char gender2 = sc.next().charAt(0);
					System.out.println("Age - 14 or younger? (Y/N): ");
					char younger = sc.next().charAt(0);
					System.out.println("Height (in cm): ");
					double height2 = sc.nextDouble();
					System.out.println("Weight (in kg): ");
					double weight2 = sc.nextDouble();
					System.out.println(new LeanBodyMassCalculator().calculate(younger, gender2, height2, weight2));
					System.out.println();
					break;
				default:
					System.out.println("Invalid choice. Please enter a valid option");
					System.out.println();
					break;
			}
			choice = getCalcChoice();

		}
	}
	public static int getCalcChoice() {
		System.out.println("List of Fitness Calculators");
		System.out.println("1. Body Mass Index (BMI) Calculator");
		System.out.println("2. Basal Metabolic Rate (BMR) Calculator");
		System.out.println("3. Body Fat Weight Calculator");
		System.out.println("4. Calorie Calculator");
		System.out.println("5. Ideal Weight Calculator");
		System.out.println("6. Lean Body Mass Calculator");
		System.out.println("7. Exit");
		System.out.print("Please select the option: ");
	    Scanner scanner = new Scanner(System.in);
	    int choice = scanner.nextInt();
	    return choice;
	}

}
