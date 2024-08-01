package com.revature.day03;

//Define a custom exception class for invalid age inputs
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

//Main class to demonstrate the custom exception
public class Age {
 public static void main(String[] args) {
     try {
         int age = Integer.parseInt(args[0]);

         // Check if age is within valid range
         if (age <= 0 || age >= 150) {
             throw new InvalidAgeException("Invalid age input: Age must be between 1 and 149");
         }

         // Check if age qualifies for voting
         if (age >= 18) {
             System.out.println("You are eligible to vote.");
         } else {
             System.out.println("You are not eligible to vote.");
         }

     } catch (NumberFormatException e) {
         System.out.println("Error: Invalid input. Please provide a valid age as a number.");
     } catch (InvalidAgeException e) {
         System.out.println(e.getMessage());
     } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Error: Please provide an age as a command line argument.");
     }
 }
}

