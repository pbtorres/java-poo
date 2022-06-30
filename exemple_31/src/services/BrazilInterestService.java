package services;

public class BrazilInterestService implements InterestService {
	
	double interestRate = 2.0;
	
	public BrazilInterestService() {
		
	}
	
	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
}
