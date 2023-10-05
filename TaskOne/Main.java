import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer c1 = new Customer("lars", "Carstensen", "it's_me");
customers
        customers.add(c1);

        printCustomers(customers);
    }
    public static void printCustomers (ArrayList<Customer> customers){
        for (Customer k : customers) {
            System.out.println(k);
        }
    }
}

