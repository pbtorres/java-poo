package model.services;

public class BrazilTaxService implements TaxService{
	
	public double tax(double amount) {
		return amount * (amount <= 100 ? 0.2 : 0.15);
	}
	
}
