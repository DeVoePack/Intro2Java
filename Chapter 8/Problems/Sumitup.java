import java.lang.StringBuffer;
import java.io.IOException;

class Sumitup
{
	public static void main (String args[])
	{
		
		float num, sum = 0;
		do
			{
				System.out.println("Enter a number (Enter 0 to quit) : ");
				num = toFloat(GetConsoleString());
				if(num == 0)
				{
					System.out.println(sum);
					break;
				}
				sum = sum + num;
			}while(num != 0);
		
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
	
	public static float toFloat (String inString)
	{
		Float tempFloat = new Float (inString);
		return tempFloat.floatValue();
	}	// end of toFloat method
}