package services;

public class UsaInterestService implements InterestService {
	
	double interestRate = 1.0;
	
	public UsaInterestService() {
		
	}

	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
}
