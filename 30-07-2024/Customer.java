public class Customer {
    
    public static int totalCustomers = 0;
    
    
    public final String CUSTOMER_TYPE = "Regular";

    
    private String name;
    private int age;

    
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        totalCustomers++;
    }

    
    public Customer() {
        this.name = "Unknown";
        this.age = 0;
        totalCustomers++;
    }

   
    public void displayInfo() {
        System.out.println("Customer Name: " + name + ", Age: " + age);
    }

    
    public void displayInfo(String message) {
        System.out.println(message + " Customer Name: " + name + ", Age: " + age);
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice", 30);
        Customer customer2 = new Customer();
        
        System.out.println("Total Customers: " + Customer.totalCustomers);
        
        customer1.displayInfo();
        customer2.displayInfo("Welcome!");

        System.out.println("Customer Type: " + customer1.CUSTOMER_TYPE);
    }
}
