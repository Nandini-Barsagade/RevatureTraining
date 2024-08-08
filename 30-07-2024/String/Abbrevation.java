package String;

import java.util.Scanner;

public class Abbrevation {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Full Name");
String FName= sc.nextLine();
String[] nameparts= FName.split(" ");
String ShortName="";
for(int i=0;i<nameparts.length-1;i++) {
	ShortName+=nameparts[i].charAt(0)+".";
}
ShortName+= nameparts[nameparts.length-1];
System.out.println("Name:"+ ShortName);
}
}