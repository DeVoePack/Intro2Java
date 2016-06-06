import java.lang.StringBuffer;
import java.io.IOException;

class Deposit
{
	public static void main(String args[])
	{
		
		float depositAmount;
		System.out.println("Begin Program");
		System.out.print("Entr deposit amount to open account: ");
		
		depositAmount = toFloat(GetConsoleString());
		
		if(depositAmount < 1000)
		{
			if(depositAmount < 100)
			{
				System.out.println("Please consider our EconoCheck account");
			}
			else
			{
				System.out.println("Please consider our FreeCheck account");
			}
		}
		else
		{
			System.out.println("Please consider our InterestMaker account");
		}
		
		System.out.println("Program End - <Press Enter Key>");
		GetConsoleString();
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
}	// end of class Deposit