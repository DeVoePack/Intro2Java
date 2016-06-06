// By David Gbogi
//  Project6_2.JAVA
import java.lang.StringBuffer;
import java.io.IOException;

class Project6_2
   {
   public static void main(String Args[])
	{
	 System.out.println("Please enter the month number:");

	 String InputString = GetConsoleString();

	 int Month = Integer.parseInt(InputString);

	 System.out.println("Enter the day number:");

	 InputString = GetConsoleString();
	 int Day = Integer.parseInt(InputString);

	 try
		{
		 int MFTBOTY = Month * 43800 + Day * 1440;
	     	System.out.println( "The amount of minutes from the start of the year = "  + MFTBOTY );
	     	
		}
	catch(ArithmeticException AE)
	{
		System.err.println("Not a Number");
	}
	catch(Exception E)
		{
		 System.err.println("General Exception Thrown");
		}
		
	}  //  end of main
	
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
		
	}	// end of method GetConsoleString

}  //  end of class Project6_2



















