package com.revature.day2;
import java.util.Scanner;
public class Attendance {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of classes held: ");
        int classesHeld = scanner.nextInt();
        
        System.out.print("Enter the number of classes attended: ");
        int classesAttended = scanner.nextInt();

        double attendancePercentage = ((double) classesAttended / classesHeld) * 100;
        System.out.println("Percentage of classes attended: " + attendancePercentage + "%");
        if (attendancePercentage >= 75) {
            System.out.println("The student is allowed to sit in the exam.");
        } else {
            
            System.out.print("Does the student have a medical cause? (Y/N): ");
            char medicalCause = scanner.next().charAt(0);

            if (medicalCause == 'Y' || medicalCause == 'y') {
                System.out.println("The student is allowed to sit in the exam due to a medical cause.");
            } else {
                System.out.println("The student is not allowed to sit in the exam.");
 
}}
}}