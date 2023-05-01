package day3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fact=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=s.nextInt(); //5
		
		for(int i=1;i<=n;i++)
		{
			//fact = fact * i; 
			fact*=i;
		}
		System.out.println("Factorial of the given number  is "+fact);

	}

}
