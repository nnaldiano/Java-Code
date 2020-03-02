
public class BankAccount {
private double Balance;

	public BankAccount(double initialBalance) {
		Balance = initialBalance;
	}
	public double deposit (double amount) {
		double newDeposit = amount;
		Balance = Balance + newDeposit;
		return Balance;
	}
	public double withdraw(double amount) {
		double newWithDraw = amount;
		Balance = Balance - newWithDraw;
		return Balance;
	}

	public double getBalance() {
		return Balance;
	}
	public void setBalance(double b) {
		Balance = b;
	}
}
