public class Pr4_Main {
	// Main method
	public static void main(String[] args) {
		// Create Account, SavingsAccount and Checking Account objects
		Pr4_Account account = new Pr4_Account(1, 20000);
		Pr4_SavingsAcc savings = new Pr4_SavingsAcc(2, 10000);
		Pr4_CheckingAcc checking = new Pr4_CheckingAcc(3, 20000, -50);

		account.setAnnualInterestRate(5);
		savings.setAnnualInterestRate(5);
		checking.setAnnualInterestRate(5);
		account.withdraw(2500);
		savings.withdraw(2000);
		checking.withdraw(2500);
		account.deposit(3000);
		savings.deposit(3000);
		checking.deposit(3000);
		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
        System.out.println("**THIS PROGRAM IS PREPARED BY DIVY_21CE134**");
	}
}