package com.revature.assignment;

import java.util.Scanner;

public class LargestSmallestArray {
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
        
        // Initialize variables to store largest and smallest elements
        int largest = numbers[0];
        int smallest = numbers[0];
        
        // Find largest and smallest elements
        for (int i = 1; i < n; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        
        // Print the largest and smallest elements
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        
        // Close the scanner
        scanner.close();
    }
}

