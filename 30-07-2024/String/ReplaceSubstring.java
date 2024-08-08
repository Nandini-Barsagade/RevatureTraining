package String;

import java.util.Scanner;

public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the original sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Input the substring to replace and the replacement string
        System.out.print("Enter the substring to replace: ");
        String substringToReplace = scanner.nextLine();

        System.out.print("Enter the replacement string: ");
        String replacementString = scanner.nextLine();

        // Perform the replacement
        String modifiedSentence = sentence.replaceAll(substringToReplace, replacementString);

        // Output the modified sentence
        System.out.println("Modified sentence: " + modifiedSentence);

        scanner.close();
    }
}

