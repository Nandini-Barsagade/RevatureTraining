package com.revature.assignment;

import java.util.Scanner;

public class IntegerStat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to store 20 integers
        int[] numbers = new int[20];
        
        // Input loop to get 20 integers from the user
        System.out.println("Enter 20 integers:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Initialize counters
        int positiveCount = 0;
        int negativeCount = 0;
        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;
        
        // Count positive, negative, odd, even, and zeros
        for (int number : numbers) {
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }
            
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            
            if (number == 0) {
                zeroCount++;
            }
        }
        
        // Print the results
        System.out.println("\nNumber of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of zeros: " + zeroCount);
        
        // Close the scanner
        scanner.close();
    }
}
