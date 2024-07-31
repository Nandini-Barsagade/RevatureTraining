import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the length of the first side of the triangle: ");
        double side1 = scanner.nextDouble();

        
        System.out.print("Enter the length of the second side of the triangle: ");
        double side2 = scanner.nextDouble();

       
        System.out.print("Enter the length of the third side of the triangle: ");
        double side3 = scanner.nextDouble();

        
        double perimeter = side1 + side2 + side3;

        
        
        System.out.println("Perimeter of the triangle: " + perimeter);

       
        scanner.close();
    }
}
