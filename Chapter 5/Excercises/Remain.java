// start of Remain.java
class Remain
{
	public static void main (String Args[])
	{
		System.out.println("Program begins");
		int dividend, divisor, quotient, remainder;
		// provide data quantities
		dividend = 37;
		divisor = 5;
		
		// process data, calculate answers
		
		quotient = dividend / divisor;
		remainder = dividend % divisor;
	
		// provide output
		System.out.println("The quotient is: " + quotient);
		System.out.println("and the remainder is: " + remainder);
	}
}