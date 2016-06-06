import java.lang.StringBuffer;
import java.io.IOException;

class City
{
	public static void main(String Args[])
	{
		System.out.println("Begin Program");
		
		String city_name = new String();
		String temp = new String();
		long population;
		
		System.out.println("Please enter the name of your city or town: ");
		city_name = GetConsoleString();
		
		System.out.print("Please enter the population of your city of town: ");
		temp = GetConsoleString();
		population = Long.parseLong (temp);
		if(population >= 171439)
		{
			System.out.println("According to the 1990 census, " + city_name);
			System.out.println("is one of the 100 largest U.S. cities.");
		}
		System.out.println("Progream End - <press a key>");
		GetConsoleString();		// end of program catch
	}	// end of method main
	
	public static String GetConsoleString()
	{
		int noMoreInput = -1;
		char enterKeyHit = '\n';
		int InputChar;
		StringBuffer InputBuffer = new StringBuffer(30);
		
		try
		{
			InputChar = System.in.read();
			
			while (InputChar != noMoreInput)
			{
				if((char) InputChar != enterKeyHit)
				{
					InputBuffer.append((char) InputChar);
				}
				else
				{
					InputBuffer.setLength (InputBuffer.length() -1 );
					break;
				}
				InputChar = System.in.read();
			}
		}
		catch(IOException IOX)
		{
			System.err.println(IOX);
		}
		return InputBuffer.toString();
		
	}		// end of method GetConsoleString
}		// end of class City