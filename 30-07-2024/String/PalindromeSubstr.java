package String;

import java.util.Scanner;

public class PalindromeSubstr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Split the input into words
        String[] words = input.split("\\s+");

        // Initialize a StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Iterate through each word in the input
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // Check if the current word is a palindrome
            if (isPalindrome(word)) {
                // If it's a palindrome, replace with asterisks of the same length
                result.append("*".repeat(word.length()));
            } else {
                // Otherwise, keep the original word
                result.append(word);
            }

            // Append a space after each word (except the last one)
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        // Output the modified string
        System.out.println("Modified string: " + result.toString());

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
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        // If all characters matched, it's a palindrome
        return true;
    }
}
