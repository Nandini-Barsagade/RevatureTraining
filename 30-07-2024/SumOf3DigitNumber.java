import java.util.Scanner;

public class SumOf3DigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a 3-digit number
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 100 || number > 999) {
            System.out.println("The number must be a 3-digit number.");
            return;
        }

        // Calculate the sum of digits
        int sum = (number / 100) + ((number / 10) % 10) + (number % 10);

        // Output the result
        System.out.println("Sum of the digits: " + sum);

        // Close the scanner
        scanner.close();
    }
}
