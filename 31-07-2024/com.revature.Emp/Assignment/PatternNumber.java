package com.revature.day2;

public class PatternNumber {
	public static void main(String[] args) {
        int rows = 4; 
        int num = 7;  
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < num - (2 * i); k++) {
                System.out.print((k % 2 == 0) ? "1" : "0");
            }
            System.out.println();
        }
    }

}
