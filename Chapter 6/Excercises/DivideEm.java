//  DivideEm.JAVA
import java.lang.StringBuffer;
import java.io.IOException;

class DivideEm
   {
   public static void main(String Args[])
	{
	 System.out.println("Please enter one number:");

	 String InputString = GetConsoleString();

	 int NumberOne = Integer.parseInt(InputString);

	 System.out.println("Please enter another number:");

	 InputString = GetConsoleString();
	 int NumberTwo = Integer.parseInt(InputString);

	 try
		{
		 int NumberThree = NumberOne / NumberTwo;
	     	System.out.println( "NumberOne divided by NumberTwo = " + NumberThree );
	     	
		}
	catch(ArithmeticException AE)
	{
		System.err.println("Divide By Zero Exception Thrown");
	}
	catch(Exception E)
		{
		 System.err.println("General Exception Thrown");
		}
	 
	 System.out.println("Press any key to continue ");
	 GetConsoleString();
		

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

}  //  end of class DivideEm



















