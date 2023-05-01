package day2;

public class ElseIfDemo {

	public static void main(String[] args) {
int mark=49;
		
		if(mark>90)
			System.out.println("O Grade");
		else if(mark>80)
			    System.out.println("A+ Grade");
		     else if(mark>70)
		    	    System.out.println("A Grade");
		          else if(mark>60)
		        	      System.out.println("B+ Grade");
		               else if(mark>=50)
		            	      System.out.println("B Grade");
		                    else
		                    	System.out.println("U Grade");
	}

}
