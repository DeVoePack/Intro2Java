import java.lang.StringBuffer;
import java.io.IOException;
class MyInput
{
 public static void main(String Args[])
	{
  System.out.println("Program begins");
  
  int noMoreInput = -1;
  char enterKeyHit = '\n';
  int InputChar;
  StringBuffer InputBuffer = new StringBuffer(30);
  
  System.out.println("Please enter a one word name:");
  try
   {
   InputChar = System.in.read();
   
  while(InputChar != noMoreInput)
   {
   if((char) InputChar != enterKeyHit)
     {
     InputBuffer.append((char)InputChar);
     }
   else
    {
    InputBuffer.setLength( InputBuffer.length() -1 );
    break;
    }
   InputChar = System.in.read();
   }
  }
  catch(IOException IOX)
   {
   System.err.println(IOX);
   }
   
  System.out.println("You entered: " + InputBuffer.toString());
	}
}  //end of class myInput