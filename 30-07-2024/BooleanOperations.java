public class BooleanOperations {
    public static void main(String[] args) {
        
        boolean a = true;
        boolean b = false;

        
        System.out.println("Initial values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        
        boolean notA = !a;
        System.out.println("!a = " + notA);

        
        boolean aOrB = a | b;
        System.out.println("a | b = " + aOrB);

        
        boolean expression = (!a & b) | (a & !b);
        System.out.println("(!a & b) | (a & !b) = " + expression);
    }
}
