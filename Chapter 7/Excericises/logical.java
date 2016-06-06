public class logical
{
	public static void main (String args[])
	{
		int i = 2;
		int j = 3;
		boolean true_false;
		true_false = (i < 3 && j < 3);
		System.out.println ("The result of (i < 3 && j > 3) is " + true_false);
		
		true_false = (i < 3 && j >=3);
		System.out.println ("The result of (i < 3 && j >= 3) is " + true_false);
		
		System.out.println("The result of ( i == 1 || i == 2) is " + (i == 1 || i == 2));
		
		true_false = (j < 4);
		System.out.println("The result of (j < 4) is " + true_false);
		
		true_false = !true_false;
		System.out.println("The result of !true_false is " + !true_false);
		
	}	// end of method main
}		// end of class logical