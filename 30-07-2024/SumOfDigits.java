import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a 5-digit number
        System.out.print("Enter a 5-digit number: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 10000 || number > 99999) {
            System.out.println("The number must be a 5-digit number.");
            return;
        }

        // Extract the first and second last digits
        int firstDigit = number / 10000;
        int secondLastDigit = (number / 10) % 10;

        // Calculate the sum
        int sum = firstDigit + secondLastDigit;

        // Output the result
        System.out.println("Sum of the first and the second last digit: " + sum);

        // Close the scanner
        scanner.close();
    }
}
