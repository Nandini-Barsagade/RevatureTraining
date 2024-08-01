package com.revature.assignment;

import java.util.Scanner;

public class ArraySumProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize variables for sum and product
        int sum = 0;
        long product = 1; // Use long to handle potential overflow in product
        
        // Create an array to store integers
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        
        // Input loop to get integers from the user and calculate sum and product
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            
            // Calculate sum
            sum += numbers[i];
            
            // Calculate product (use long to prevent overflow)
            product *= numbers[i];
        }
        
        // Print the sum and product
        System.out.println("\nSum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
        
        // Close the scanner
        scanner.close();
    }
}
