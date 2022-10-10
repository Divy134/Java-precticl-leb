// **THIS PROGRAM IS PREPARED BY DIVY_21CE134**
package Java_Assignment;

class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private java.util.Date dateCreated;
    public Object date;

    public Account() {
        dateCreated = new java.util.Date();
    }
    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new java.util.Date();
    }
    public int getId() {
        return this.id;
    }
    public double getBalance() {
        return this.balance;
    }
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setId(int newId) {
        id = newId;
    }
    public void setBalance(double newBalance) {
        balance = newBalance;
    }
    public static void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    public void getAccountdetailes() {
        System.out.println("id : " + getId());
        System.out.println("Balance : " + getBalance());
        System.out.println("annualInterestRate : " + Account.getAnnualInterestRate());
        System.out.println("Monthly interest is : " + getMonthlyInterest());
        System.out.println("This account was created at :  " + getDateCreated());
    }
    public void deposit() {
    }
    public void withdraw() {
    }
}

public class Pr_1 {
    public static void main(String[] args) {
        // Account a = new Account(2, 500);
        // Account.setAnnualInterestRate(5);
        Account a = new Account();
        a.setId(25);
        a.setBalance(1000);
        Account.setAnnualInterestRate(5);
        a.withdraw(250);
        a.deposit(300);
        a.getAccountdetailes();
    }
}
