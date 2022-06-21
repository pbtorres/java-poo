package entities;

import exeptions.BusinessException;

public class Account {
	private int number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {
		
	}
	
	public Account(int number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getWithDrawLimit() {
		return withDrawLimit;
	}
	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withDraw(Double amount) {
		validateWithDraw(amount);
		this.balance -= amount;
	}
	
	private void validateWithDraw(Double amount) {
		if(amount > getWithDrawLimit()) {
			throw new BusinessException("Erro de saque: a quantia excede o limite de saque");
		}
		if(amount > balance) {
			throw new BusinessException("Erro de saque: saldo insuficiente");
		}
	}
	
}
