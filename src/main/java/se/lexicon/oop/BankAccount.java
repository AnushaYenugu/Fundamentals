package se.lexicon.oop;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phonenumber;
    static int counter =0;

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phonenumber){
        this.accountNumber=accountNumber+counter;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phonenumber=phonenumber;
        counter++;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }
    public String getPhonenumber(){
        return phonenumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhonenumber(String phonenumber){
        this.phonenumber=phonenumber;
    }

    public double depositFunds(double amount){
        double balance=getBalance()+amount;
        setBalance(balance);
        return balance;
    }

    public double withDrawFunds(double amount)
    {
        if(checkInsufficient(amount)==true){
           balance= getBalance()-amount;
            System.out.println("Transaction is success, please collect your money ");
            System.out.println("The remaining balance is: ");
           return balance;
        }
        else {
            System.out.println("No sufficient balance to with draw. Please check the balance");
            return balance;
        }
    }

    public boolean checkInsufficient(double amount){
        if(amount >= getBalance())
        {
            return false;
        }
        else
            return true;
    }
}
