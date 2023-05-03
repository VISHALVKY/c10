package day6;


public class AbstractionDemo 
{

	public static void main(String[] args) 
	{
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.sleep();
		d.sound();
		
		c.sleep();
		c.sound();

	}

}