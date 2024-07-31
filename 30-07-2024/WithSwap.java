public class WithSwap {
    public static void main(String[] args) {
        
        int a = 6;
        int b = 8;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

       
        int temp = a;  
        a = b;         
        b = temp;     

        
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
