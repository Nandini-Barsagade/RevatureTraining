package com.revature.assignment;

import java.util.Scanner;

public class ReverseArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to store 10 integers
        int[] originalArray = new int[10];
        
        // Input loop to get 10 integers from the user
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }
        
        // Create a new array to store elements in reverse order
        int[] reverseArray = new int[10];
        
        // Copy elements in reverse order
        for (int i = 0; i < 10; i++) {
            reverseArray[i] = originalArray[9 - i];
        }
        
        // Print the original array
        System.out.print("\nOriginal array: ");
        for (int number : originalArray) {
            System.out.print(number + " ");
        }
        
        // Print the reversed array
        System.out.print("\nReversed array: ");
        for (int number : reverseArray) {
            System.out.print(number + " ");
        }
        
        // Close the scanner
        scanner.close();
    }
}
