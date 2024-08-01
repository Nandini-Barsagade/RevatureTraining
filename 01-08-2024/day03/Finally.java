package com.revature.day03;

//Define a custom exception class
class Custom4 extends Exception {
 public Custom4(String message) {
     super(message);
 }
}

//Example class that raises the custom exception
class CustomExceptionDemo {
 private int value;

 public CustomExceptionDemo(int value) {
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
     } catch (CustomException e) {
         System.out.println("Exception caught: " + e.getMessage());
     } finally {
         System.out.println("Graceful goodbye");
     }
 }
}

