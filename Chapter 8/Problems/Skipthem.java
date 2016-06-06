class Skipthem
{
	public static void main (String args[])
	{
		
		int num;
		for(num = 0; num <= 20; num++)
		{
		if(num == 15 || num == 16 || num == 17)
		continue;
		System.out.println(num);
		}
	}	// end of main method
}