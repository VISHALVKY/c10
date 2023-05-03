package day6;


public class IoB implements Bank
{
	public void credit()
	{
		System.out.println("Your Salary credited succcessfully");
	}
	
	public void debit()
	{
		System.out.println("Rs. 1000 debited from your account");
	}

	public static void main(String[] args) 
	{
		IoB i = new IoB();
		i.credit();
		i.debit();

	}

}