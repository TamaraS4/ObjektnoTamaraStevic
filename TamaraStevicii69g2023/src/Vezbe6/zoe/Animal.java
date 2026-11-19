package Vezbe6.zoe;

public class Animal  {

	protected String name;
	protected int age;
	protected String mood;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	public void eat() {
		mood= "Animal is well fed and happy";
	}
	
	public void makeSound() {
		System.out.println("Animal is makinga a sound");
	}
	
	public Animal () {
		super();
	}
	
	public Animal(String name, int age, String mood) {
		this.name=name;
		this.age=age;
		this.mood=mood;
	}
}
