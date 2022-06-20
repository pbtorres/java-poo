package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkLevel;

public class Worker {
	private String name;
	private WorkLevel level;
	private Double baseSalary;
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
		
	}
	
	public Worker(String name, WorkLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	public double inCome(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		
		for(HourContract c : contracts) {
			cal.setTime(c.getDate()); 		
			if(year == (cal.get(Calendar.YEAR)) && month == (1 + cal.get(Calendar.MONTH))) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
	
	public List<HourContract> getContracts() {
		return contracts;
	}
	
	public void addContract(HourContract contrac ) {
		contracts.add(contrac);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkLevel getLevel() {
		return level;
	}

	public void setLevel(WorkLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	
}
