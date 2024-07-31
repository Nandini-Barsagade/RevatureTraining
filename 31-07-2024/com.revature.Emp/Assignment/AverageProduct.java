package com.revature.day2;
import java.util.Scanner;
public class AverageProduct {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int sum = 0;
	        long product = 1;
	        int count = 0;

	        System.out.println("Enter integers (press 'q' to quit):");

	        while (true) {
	            System.out.print("Enter a number: ");
	            String input = scanner.nextLine();

	            if (input.equalsIgnoreCase("q")) {
	                break;
	            }

	            try {
	                int number = Integer.parseInt(input);
	                sum += number;
	                product *= number;
	                count++;
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input. Please enter an integer.");
	            }
	        }

	        if (count > 0) {
	            double average = (double) sum / count;
	            System.out.println("Average of entered numbers: " + average);
	            System.out.println("Product of entered numbers: " + product);
	        } else {
	            System.out.println("No numbers were entered.");
	        }

	        scanner.close();
	    }
}
