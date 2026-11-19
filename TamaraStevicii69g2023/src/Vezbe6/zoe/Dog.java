package Vezbe6.zoe;

public class Dog extends Animal {
	
	
	@Override
	
	public void eat () {
		mood= "Is happy and is running around";
	}
	
	@Override
	public void makeSound() {
		System.out.println(" Aw aw aw");
	}
	
	public Dog() {
		super ();
	}

	public Dog(String name, int age, String mood) {
		super(name,age,mood);
	}
}
