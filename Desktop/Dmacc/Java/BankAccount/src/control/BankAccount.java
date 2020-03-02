package control;

public class BankAccount  {
	private double Balance;
	
	
	public BankAccount() {
		Balance = 0;
	}

	public BankAccount(double balance) {
		super();
		Balance = balance;
	}
	public void deposit (double amount) {
		double newBalance = Balance + amount;
		Balance = newBalance;
	}
	public void withdraw(double amount) {
		double newBalance = Balance - amount;
		Balance = newBalance;
	}

	public double getBalance() {
		return Balance;
	}
}
