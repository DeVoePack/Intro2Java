import java.lang.StringBuffer;
import java.io.IOException;

class While1
{
	public static void main(String args[])
	{
		float num;
		System.out.println("Please enter the number to divide: ");
		num = toFloat(GetConsoleString());
		while(num > 1)
		{
			System.out.println("num is: " + num);
			num = num / 2;
		}
	}	// end of main method
	
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
}	// end of class While1