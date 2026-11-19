package Vezbe6;

public class Intern extends Employee {

	public Intern() {
		
	}
	
	public Intern (String name, int baseSalary) {
		super(name, baseSalary);
		
	}
	
	@Override
	public double calculateSalary () {
		return baseSalary*0.6- baseSalary*0.1;
	}
}
