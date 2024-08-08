package String;


	import java.util.Scanner;

	public class Count {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the string
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Initialize counters
	        int vowelCount = 0;
	        int consonantCount = 0;
	        int digitCount = 0;
	        int spaceCount = 0;

	        // Convert the string to lowercase to handle case insensitivity
	        input = input.toLowerCase();

	        // Traverse the string character by character
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            // Check if character is a vowel
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                vowelCount++;
	            }
	            // Check if character is a consonant
	            else if ((ch >= 'a' && ch <= 'z') && !isVowel(ch)) {
	                consonantCount++;
	            }
	            // Check if character is a digit
	            else if (ch >= '0' && ch <= '9') {
	                digitCount++;
	            }
	            // Check if character is whitespace
	            else if (Character.isWhitespace(ch)) {
	                spaceCount++;
	            }
	            // Ignore other characters like punctuation marks
	        }

	        // Output the results
	        System.out.println("Number of vowels: " + vowelCount);
	        System.out.println("Number of consonants: " + consonantCount);
	        System.out.println("Number of digits: " + digitCount);
	        System.out.println("Number of white spaces: " + spaceCount);

	        scanner.close();
	    }

	    // Helper method to check if a character is a vowel
	    private static boolean isVowel(char ch) {
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	    }
	}
