package Vezbe6.zoe;

public class Main {

	public static void main(String[] args) {
		Animal a1= new Animal ("Rex", 10, "Neutral mood");
		
		a1.makeSound();
		a1.eat();
		System.out.println(a1.getMood());

	

	Dog d1= new Dog("Max", 5, "Sad");
	d1.eat ();
	d1.makeSound();
	System.out.println(d1.getMood());
	
	Animal a2= new Dog("Zlatni", 4, "Happy");
	System.out.println(a2.getMood());
	a2.makeSound();
	
	}
}

