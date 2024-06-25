public class Account {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public Account(){
        this("56789", 2.50, "Default name", "Default address", "Default Phone"); //constructor chaining
        System.out.println("Empty Constructor Called");
    }

    public Account(String accountNumber, double accountBalance, String customerName, String customerEmail, String phoneNumber){
        System.out.println("Another constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String customerEmail, String phoneNumber) {
        this("99999", 100.55, customerName, customerEmail, phoneNumber); //constructor with default values
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.phoneNumber = phoneNumber;
    }

    public void accountDeposit(double amountDeposit){
        this.accountBalance += amountDeposit;
    }

    public void accountWithdrawal(double amountWithdraw){
        if ((this.accountBalance - amountWithdraw) >= 0){
            this.accountBalance -= amountWithdraw;
        } else {
            System.out.println("The amount withdrawn would exceed your current balance of " + accountBalance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
