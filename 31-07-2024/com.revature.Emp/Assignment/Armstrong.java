package com.revature.day2;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 500 are:");

        for (int num = 100; num < 500; num++) {
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, 3);
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
