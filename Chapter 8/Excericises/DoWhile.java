import java.lang.StringBuffer;
import java.io.IOException;

class DoWhile
{
	public static void main(String args[])
	{
		float num, squared;
		
		do
		{
			System.out.println("Enter a number (Enter 0 to quite): ");
			num = toFloat(GetConsoleString());
			squared = num * num;
			System.out.println("The number " + num + "squared is: " + squared);
		} while(num != 0);
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
		
	}	// end of method GetConsoleString
	
	public static float toFloat (String inString)
	{
		Float tempFloat = new Float (inString);
		return tempFloat.floatValue();
	}	// end of toFloat method
}