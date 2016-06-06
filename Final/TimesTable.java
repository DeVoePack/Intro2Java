class TimesTable 
{
	public static void main (String args [])
	{
		// print main table
		for (int i = 1; i <= 12; ++i)
		{
			System.out.print(i + ":");
			for (int j = 1; j <= 12; ++j)
			{
				System.out.print(i * j + "\t ");
			}
			System.out.println();
		}
	} // end of method main
}
      