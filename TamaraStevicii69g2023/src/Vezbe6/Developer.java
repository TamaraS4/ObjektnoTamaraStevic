package Vezbe6;

public class Developer extends Employee {

	public Developer () {
		
	}
	
	public Developer (String name, int baseSalary) {
		this.name=name;
		this.baseSalary=baseSalary;
	}
	
	@Override
	public double calculateSalary() {
		//1. nacin
		//return baseSalary - baseSalary*0.1- baseSalary*0.2 + baseSalary*0.2;
		//2. nacin
		return super.calculateSalary() + baseSalary*0.2;
		
 	}
}
