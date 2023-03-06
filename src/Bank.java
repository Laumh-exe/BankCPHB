import java.util.ArrayList;

public class Bank {
    public int customerLimit;
    private ArrayList<Customer> customers;

    public Bank() {
        this.customerLimit = 3;
        customers = new ArrayList<>();
    }

    public void registerCustomer(String name) {
        Customer customer = new Customer(name);
        customers.add(customer);
    }

    public void displayCustomers() {
        for(Customer customer : customers) {
            System.out.println(customer.getName());
        }
    }
}
