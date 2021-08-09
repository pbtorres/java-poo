package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	
	//construct with two arguments
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	//construct with three arguments
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	//methods gets and sets 
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	
	//method deposit
	public void deposit (double amount) {
		balance += amount;
	}
	//method withdraw with discount rate
	public void withdraw (double amount) {
		balance -= amount + 5.0;
	}
	//toString
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
