public class Calculator {
    public static void main(String[] args) {
       
        int number = 2345;

        
        int resultAfterAddition = number + 8;

        
        int quotient = resultAfterAddition / 3;

        int remainder = quotient % 5;

        
        int finalResult = remainder * 5;

        
        System.out.println("Initial number: " + number);
        System.out.println("After adding 8: " + resultAfterAddition);
        System.out.println("After dividing by 3: " + quotient);
        System.out.println("Modulus of quotient with 5: " + remainder);
        System.out.println("Final result after multiplying by 5: " + finalResult);
    }
}
