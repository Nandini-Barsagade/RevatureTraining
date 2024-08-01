package com.revature.assignment;

import java.util.Scanner;

public class IntegerArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to store 10 integers
        int[] numbers = new int[10];
        
        // Input loop to get 10 integers from the user
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Ask user for a number to search
        System.out.print("Enter a number to search in the array: ");
        int searchNumber = scanner.nextInt();
        
        // Check if the number is present in the array
        boolean found = false;
        for (int number : numbers) {
            if (number == searchNumber) {
                found = true;
                break;
            }
        }
        
        // Print result
        if (found) {
            System.out.println(searchNumber + " is present in the array.");
        } else {
            System.out.println(searchNumber + " is not present in the array.");
        }
        
        // Close the scanner
        scanner.close();
    }
}

