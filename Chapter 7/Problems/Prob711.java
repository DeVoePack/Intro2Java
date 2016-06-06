public class Prob711
{
	public static void main(String args[])
	{
		int i = 4;
		int j = 3;
		boolean true_false;
		
		true_false = (j< 4);
		System.out.println(true_false);
		
		true_false = (j < 3);
		System.out.println(true_false);
		
		true_false = (j < i);
		System.out.println(true_false);
		
		true_false = (i < 4);
		System.out.println(true_false);
		
		true_false = (j <= 4);
		System.out.println(true_false);
		
		true_false = (4 > 4);
		System.out.println(true_false);
		
		true_false = (i != j);
		System.out.println(true_false);
		
		true_false = (i < j || i < 100);
		System.out.println(true_false);
		
		true_false = (i == j && i < 100);
		System.out.println(true_false);
		
		true_false = (i < j || true_false && j >= 3);
		System.out.println(true_false);
		
		true_false = (!(i > 2 && j == 4));
		System.out.println(true_false);
		
		true_false = !true;	
		System.out.println(true_false);
	}
}
