package entities;

public class LegalPerson extends Person{
	private int employeeNumber;
	
	public LegalPerson() {
		super();
	}
	
	public LegalPerson(String name, Double annualIncome, int employeeNumber) {
		super(name, annualIncome);
		this.employeeNumber = employeeNumber;
	}	
	
	@Override
	public double calculationTax() {
		
		Double totalTax;
		
		if(employeeNumber <= 10) {
			totalTax = this.getAnnualIncome() * 16/100;
			return totalTax;
		}else {
			totalTax = this.getAnnualIncome() * 14/100;
			return totalTax;
		}
		
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

}
