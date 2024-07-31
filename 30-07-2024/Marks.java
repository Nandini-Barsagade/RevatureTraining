import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the marks for Subject 1 (out of 100): ");
        double marks1 = scanner.nextDouble();

        System.out.print("Enter the marks for Subject 2 (out of 100): ");
        double marks2 = scanner.nextDouble();

        System.out.print("Enter the marks for Subject 3 (out of 100): ");
        double marks3 = scanner.nextDouble();

        
        if (marks1 < 0 || marks1 > 100 || marks2 < 0 || marks2 > 100 || marks3 < 0 || marks3 > 100) {
            System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
            return;
        }

        
        double totalMarks = marks1 + marks2 + marks3;
        double percentage = (totalMarks / 300) * 100; // Total possible marks are 300

        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

       
        scanner.close();
    }
}
