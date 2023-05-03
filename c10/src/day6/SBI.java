package day6;

public class SBI implements Bank
{
	public void credit()
	{
		System.out.println("Rs. 25000 credited");
	}
	
	public void debit()
	{
		System.out.println("2000 rs debited");
	}

	public static void main(String[] args) 
	{
		SBI s = new SBI();
		s.credit();
		s.debit();
	}

}