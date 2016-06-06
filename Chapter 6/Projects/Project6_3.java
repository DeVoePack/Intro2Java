// By David Gbogi
// Project6_3.JAVA
import java.lang.StringBuffer;
import java.io.IOException;

class Project6_3
{
	public static void main(String Args[])
	{
		int noMoreInput = -1;
		char enterKeyHit = '\n';
		int InputChar;
		StringBuffer InputBuffer = new StringBuffer(30);
		
		System.out.println("Please enter your first name:");
		String First = GetConsoleString();
		
		System.out.println("Please enter your middle initial:");
		String Initial = GetConsoleString();
		
		System.out.println("Please enter your last name:");
		String Last = GetConsoleString();
		
		try
		{
			System.out.println("Your full name is:" + First + " " + Initial + " " + Last+ " ");
		}
		
		catch(Exception E)
		{
			System.err.println("General Exception Thrown");
		}
		
		
	}
	
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

}