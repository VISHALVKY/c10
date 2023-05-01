package day3;
import java.util.*;


public class SumOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=s.nextInt(); //5
		
		for(int i=1;i<=n;i++)
		{
			sum = sum +i;
		}
		System.out.println("Sum is "+sum);

	}

}
