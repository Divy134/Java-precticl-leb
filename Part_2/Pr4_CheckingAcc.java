public class Pr4_CheckingAcc extends Pr4_Account {
	private double overdraftLimit;

	public Pr4_CheckingAcc() {   //Default constructore..
		super();
		overdraftLimit = -50;
	}

	public Pr4_CheckingAcc(int id, double balance, double overdraftLimit) {    //perameterized constructore..
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void withdraw(double amount) {
		if (getBalance() - amount > overdraftLimit) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("Error! Amount exceeds overdraft limit.");
	}

	public String toString() {
		return super.toString() + "\nOverdraft limit: Rs " + 
		String.format("%.2f", overdraftLimit);
	}
}