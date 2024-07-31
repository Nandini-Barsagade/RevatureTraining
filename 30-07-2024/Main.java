


class Operations {

    
    int add(int a, int b) {
        return a + b;
    }

    
    int subtract(int a, int b) {
        return a - b;
    }

    
    int multiply(int a, int b) {
        return a * b;
    }

    
    int divide(int a, int b) {
        
            return a / b;
       
    }
}
public class Main{
public static void main(String[] args) {
        int num1 = 12;
        int num2 = 6;

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
    }
}