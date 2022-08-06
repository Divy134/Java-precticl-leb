import java.util.Date;

public class Pr4_Account {

	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	
    
	Pr4_Account() {      //Default Constructore for create default constructor..
		this(0, 0); 
	}

	
	Pr4_Account(int id, double balance) {  //Perameterized constructore with create of specific Id and Acc.No. 
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	public void setId(int id) {   // Mutator methods
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double Ar) {
		annualInterestRate = Ar;
	}

	public int getId() {    // Accessor methods
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public String getDateCreated() {
		return dateCreated.toString();
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public String toString() {    //toString methode..
		return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
			+ "\nBalance: Rs " + String.format("%.2f", balance) + 
			"\nMonthly interest: Rs " + String.format("%.2f", getMonthlyInterest());
	}
}