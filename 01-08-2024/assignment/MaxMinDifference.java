package com.revature.assignment;

import java.util.Scanner;
import java.util.Arrays;

public class MaxMinDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Create an array to store integers
        int[] numbers = new int[n];
        
        // Input loop to get integers from the user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Sort the array to find max and min differences
        Arrays.sort(numbers);
        
        // Calculate maximum difference (highest - lowest)
        int maxDifference = numbers[n-1] - numbers[0];
        
        // Calculate minimum difference (second lowest - lowest)
        int minDifference = numbers[1] - numbers[0];
        
        // Find the pair of elements with maximum and minimum differences
        int maxFirstElement = numbers[0];
        int maxSecondElement = numbers[n-1];
        
        int minFirstElement = numbers[0];
        int minSecondElement = numbers[1];
        
        // Print the results
        System.out.println("Pair with maximum difference: (" + maxFirstElement + ", " + maxSecondElement + ")");
        System.out.println("Maximum difference: " + maxDifference);
        
        System.out.println("Pair with minimum difference: (" + minFirstElement + ", " + minSecondElement + ")");
        System.out.println("Minimum difference: " + minDifference);
        
        // Close the scanner
        scanner.close();
    }
}
