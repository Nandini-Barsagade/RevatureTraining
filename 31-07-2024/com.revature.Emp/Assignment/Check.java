package com.revature.day2;
import java.util.Scanner;
public class Check {
 public static void main(String []args ) {
	 
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the Length:");
	int length = sc.nextInt();
	
	System.out.println("Enter the Breadth");
	int breadth=sc.nextInt();
	
	if(length==breadth) {
		System.out.println("It is a Square");}
	else {
			System.out.println("It is not a square");
		
	}
	 
 }
}
