class IntegerTest
{
	public static void main(String Args[])
	{
		System.out.println("Begin Program");
		
		Integer IntOne = new Integer(2);	//Create three integers
		Integer IntTwo = new Integer(3);		// objects and give
		Integer IntThree = new Integer(3);	// them values.
		
		boolean true_false;
		
		// Test to see if IntOne is equal to IntTwo
		true_false = IntOne.equals((Object) IntTwo);
		System.out.println("It is " + true_false + " that IntOne equals IntTwo");
		
		//Test to see if IntTwo is equal to IntThree
		true_false = IntTwo.equals((Object) IntThree);
		System.out.println("It is " + true_false + " that IntTwo equals IntThree");
	}	// end of method main
}		// end of class IntegerTest