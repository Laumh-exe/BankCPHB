public class Customer {
    private int id;
    private String name;
    private Account account;
    private static int counter = 1;

    public Customer(String name) {
        this.name = name;
        this.id = counter;
        counter++;
    }

    public int getId() {
        return 0;
    }

    public String getName(){
        return this.name;
    }

    public Account getAccount() {
        return this.account;
    }
}
