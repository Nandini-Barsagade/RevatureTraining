package com.revature.day03;
class Custom1 extends Exception {
    public Custom1(String message) {
        super(message);
    }
}

// Example class that raises the custom exception
class Throw {
    private int value;

    public Throw(int value) {
        this.value = value;
    }

    public void processValue() throws CustomException {
        if (value < 0) {
            throw new CustomException("Value cannot be negative");
        } else {
            System.out.println("Value is: " + value);
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting main method");

        try {
            System.out.println("Starting try block");
            Throw demo = new Throw(-1);
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
