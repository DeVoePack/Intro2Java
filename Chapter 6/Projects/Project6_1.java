// By David Gbogi
//  Project6_1.JAVA
import java.lang.StringBuffer;
import java.io.IOException;

class Project6_1
   {
   public static void main(String Args[])
	{
	 System.out.println("Please enter the hour:");

	 String InputString = GetConsoleString();

	 int Hour = Integer.parseInt(InputString);

	 System.out.println("Please enter the minute:");

	 InputString = GetConsoleString();
	 int Minutes = Integer.parseInt(InputString);
	 
	 System.out.println("Please enter the second:");
	 
	 InputString = GetConsoleString();
	 int Seconds = Integer.parseInt(InputString);

	 try
		{
		 int Midnight = Hour * 3600 + Minutes * 60 + Seconds;
	     System.out.println( "The amount of seconds from Midnight is " + Midnight );
	     	
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

// GetConsoleString is a courier who runs from your pogram out of the keyboard.

}  //  end of class Project6_1



















