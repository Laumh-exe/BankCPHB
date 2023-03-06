public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        TextUI ui = new TextUI();
        int count = 0;

        while(count < bank.customerLimit) {
            String name = ui.getInput("Write the name of the customer: ");

            bank.registerCustomer(name);
            count++;
        }

        bank.displayCustomers();
    }
}