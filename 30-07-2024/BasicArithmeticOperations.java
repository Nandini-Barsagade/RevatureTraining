public class BasicArithmeticOperations {
    public static void main(String[] args) {
        // Hard-coded numbers
        int num1 = 10;
        int num2 = 5;

       
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

      
        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        
        int product = num1 * num2;
        System.out.println("Product: " + product);

        
        if (num2 != 0) {
            double quotient = (double) num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
