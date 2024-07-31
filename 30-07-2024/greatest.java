public class GreatestOfThree {
    public static void main(String[] args) {
        // Hard-coded numbers
        int num1 = 25;
        int num2 = 30;
        int num3 = 20;

        // Using short-circuit operators to find the greatest number
        int greatest = num1;

        // Compare num1 with num2 and num3
        greatest = (num2 > greatest) ? num2 : greatest;
        greatest = (num3 > greatest) ? num3 : greatest;

        System.out.println("The greatest number is: " + greatest);
    }
}
