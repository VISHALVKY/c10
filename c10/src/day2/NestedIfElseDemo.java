package day2;
import java.util.*;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 Values");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		System.out.println("Values "+a+" "+b+" "+c);
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("Greatest Value is "+a);
			}
			else
			{
				System.out.println("Greatest Value is "+c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("Greatest Value is "+b);
			}
			else
			{
				System.out.println("Greatest Value is "+c);
			}
		}

	}

}
