package com.revature.day03;

//Define a custom exception class
class Custom3 extends Exception {
 public Custom3(String message) {
     super(message);
 }
}

//Example class that raises the custom exception
class Duck {
 private int value;

 public Duck(int value) {
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
         Duck demo = new Duck(-1);
         demo.processValue();
         System.out.println("Ending try block");
     } catch (CustomException e) {
         System.out.println("Duck the exception: Ignoring CustomException");
         // Do nothing or perform minimal action
     }

     System.out.println("Ending main method");
 }
}
