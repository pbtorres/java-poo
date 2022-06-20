package entities;

public class PhysicalPerson extends Person {
	private Double healthSpending;
	
	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}
	
	@Override
	public double calculationTax() {
			
		Double totalTax;
		
		if(this.getAnnualIncome() < 20000.00) {
			totalTax = ((this.getAnnualIncome() * 15/100) - (healthSpending * 50/100));	
			return totalTax;
		}else {
			totalTax = ((this.getAnnualIncome() * 25/100) - (healthSpending * 50/100));
			return totalTax;
		}
		
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	
}
