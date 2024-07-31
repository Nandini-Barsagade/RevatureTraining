public class Members {
    public static void main(String[] args) {
        
        Customer customer1 = new Customer("Alice", 30);
        Customer customer2 = new Customer();

        customer1.setName("Alice Smith");
        customer1.setAge(35);

        customer2.setName("Bob Johnson");
        customer2.setAge(25);

        
        System.out.println("Customer 1 Info:");
        customer1.displayInfo();
        customer1.displayInfo("Hello!");

        System.out.println("\nCustomer 2 Info:");
        customer2.displayInfo();
        customer2.displayInfo("Greetings!");

        
        System.out.println("\nTotal Customers: " + Customer.totalCustomers);

        
        System.out.println("Customer Type: " + customer1.CUSTOMER_TYPE);
    }
}
