package String;

import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the input string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("'" + input + "' is a palindrome.");
        } else {
            System.out.println("'" + input + "' is not a palindrome.");
        }

        scanner.close();
    }

    // Function to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Initialize pointers for comparing characters
        int left = 0;
        int right = str.length() - 1;

        // Traverse the string from both ends towards the center
        while (left < right) {
            // Ignore non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            // Move to the next characters
            left++;
            right--;
        }

        // If all characters matched, it's a palindrome
        return true;
    }
}