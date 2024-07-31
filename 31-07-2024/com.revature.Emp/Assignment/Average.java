package com.revature.day2;
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int length= 10;
        System.out.println("Enter 10 integers");

        for (int i = 0; i < length; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        
        double average = (double) sum / length;

        
        System.out.println("The average value of the entered integers is: " + average);
	}
}
