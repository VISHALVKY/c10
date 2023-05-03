package day5;

public class Hierarchical 
{

	public static void main(String[] args) 
	{
		Cat c = new Cat();
		Dog d = new Dog();
		Tiger t = new Tiger();
		
		c.eat();
		c.meow();
		
		d.eat();
		d.bark();
		
		t.eat();
		t.roar();

	}

}