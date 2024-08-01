package com.revature.day03;

class CustomException extends Exception {
 private String customMessage;

 public CustomException(String message) {
     this.customMessage = message;
 }

 @Override
 public String getMessage() {
     return "Custom Exception Message: " + customMessage;
 }
}

public class Custom {
 public static void main(String[] args) {
     try {
         throw new CustomException("This is a custom exception message.");
     } catch (CustomException e) {
         System.out.println(e.getMessage());
     }
 }
}

