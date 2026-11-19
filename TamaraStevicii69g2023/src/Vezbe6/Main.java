package Vezbe6;

public class Main {

	public static void main(String[] args) {
		Employee e1= new Employee ("Marko", 200000);
		System.out.println(e1.calculateSalary());
		
		Employee e2= new Developer ("Ana", 200000);
		System.out.println(e2.calculateSalary());
		
		Employee e3= new Manager ("Dragan", 200000);
		System.out.println(e3.calculateSalary());
		
		Employee e4= new Intern ("Marija", 200000);
		System.out.println(e4.calculateSalary());

	}

}
