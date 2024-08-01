package com.revature.day03;

//Define a custom exception class
class Custom2 extends Exception {
 public Custom2(String message) {
     super(message);
 }
}

//Example class that raises the custom exception
class Example{
 private int value;

 public Example(int value) {
     this.value = value;
 }

 public void processValue() throws CustomException {
     System.out.println("Starting processValue method");
     if (value < 0) {
         System.out.println("Throwing CustomException: Value is negative");
         throw new CustomException("Value cannot be negative");
     } else {
         System.out.println("Value is: " + value);
     }
     System.out.println("Ending processValue method");
 }

 public static void main(String[] args) {
     System.out.println("Starting main method");

     try {
         System.out.println("Starting try block");
         Example demo = new Example(-1);
         demo.processValue();
         System.out.println("Ending try block");
     } catch (CustomException e) {
         System.out.println("Starting catch block");
         System.out.println("Custom Exception caught: " + e.getMessage());
         System.out.println("Ending catch block");
     }

     System.out.println("Ending main method");
 }
}

