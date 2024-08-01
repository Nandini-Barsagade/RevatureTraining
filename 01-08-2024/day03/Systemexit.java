package com.revature.day03;

//Define a custom exception class
class Custom5 extends Exception {
 public Custom5(String message) {
     super(message);
 }
}

//Example class that raises the custom exception
class Systemexit {
 private int value;

 public Systemexit(int value) {
     this.value = value;
 }

 public void processValue() throws CustomException {
     if (value < 0) {
         throw new CustomException("Value cannot be negative");
     }
     System.out.println("Value is: " + value);
 }

 public static void main(String[] args) {
     try {
         CustomExceptionDemo demo = new CustomExceptionDemo(-1);
         demo.processValue();
         System.out.println("Calling System.exit(0)");
         System.exit(0);  // Terminate the JVM
     } catch (CustomException e) {
         System.out.println("Exception caught: " + e.getMessage());
     } finally {
         System.out.println("Graceful goodbye");  // This will not execute
     }
 }
}
