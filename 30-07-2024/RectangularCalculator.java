import java.util.Scanner;

public class RectangularCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

       
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area of Rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);

        // Close the scanner
        scanner.close();
    }
}
