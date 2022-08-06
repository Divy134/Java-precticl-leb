class Pr4_SavingsAcc extends Pr4_Account {
	
	public Pr4_SavingsAcc() {
		super();
	}

	public Pr4_SavingsAcc(int id, double balance) {
		super(id, balance);
	}

	public void withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println(
				"Error! Savings account overdrawn transtaction rejected");
	}
    public String tostrString()
    {
        return super.toString(); 
    }
}