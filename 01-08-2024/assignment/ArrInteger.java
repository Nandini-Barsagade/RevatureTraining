package com.revature.assignment;

import java.util.Scanner;

public class ArrInteger {
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
        
        // Print the integers stored in the array
        System.out.println("Integers entered by user:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        
        // Close the scanner
        scanner.close();
    }
}
