package Vezbe6;

public class Employee {

	protected String name;
	protected int baseSalary;
	
	public double calculateSalary() {
		return baseSalary - baseSalary*0.1- baseSalary*0.2;
	}
	
	public Employee() {
		
	}
	
	public Employee(String name,int baseSalary) {
	this.name=name;
	this.baseSalary=baseSalary;
	
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	

}