package part7;

import java.math.BigDecimal;

public class BankAccount {
    public BankAccount(){
        this(1234, BigDecimal.ONE, "Murali");
    }
    public BankAccount(long accountNumber, BigDecimal accountBalance, String customerName){
        this.accountNumber =  accountNumber;
        this.accountBalance = accountBalance;
        setCustomerName(customerName);
    }
    private long accountNumber;
    private BigDecimal accountBalance = BigDecimal.ZERO;
    private String customerName;
    private String phoneNumber;
    private String email;

    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public BigDecimal getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        System.out.println("setter called");
        this.customerName = customerName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void deposit(BigDecimal amount){
        accountBalance = accountBalance.add(amount);
    }

    public void withdraw(BigDecimal amount){
        if((accountBalance.compareTo(amount)) < 0){
            System.out.println("Insufficient balance");
        }
        else{
            accountBalance = accountBalance.subtract(amount);
            System.out.println("withdrawl done remaining balance is " + accountBalance);
        }
    }

    public BigDecimal balance(){
        return accountBalance;
    }
    
}
