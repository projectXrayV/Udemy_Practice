public class Customer {
    private String customerName;
    private int creditLimit;
    private String customerEmail;

    public Customer(){
        this("Vickor Robinson", 5000, "vickor.robinson@gmail.com");
    }

    public Customer(String customerName, int creditLimit, String customerEmail){
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }
    public Customer(String customerName, String customerEmail){
        this(customerName, 500, customerEmail);
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
