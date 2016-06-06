// DataType.java
// Examples of variable declaration and
// initialization.
// made by David Gbogi
class DataType
{
	public static void main(String args[])
	{
		//declare a double for the square root of two
		// remember that you cannot delare a constant (final)
		// unless you are in a unique class
		double SQUARE_ROOT_OF_TWO = 1.414214;

		int i, Speed_of_sound, a; // declare i as an integer
		long j; // j as a long integer
		long k; // k as a long integer
		float n; // n as a floating point number
		byte e;
		short Speed_of_light;

		i = 3; // intialize i to 3
		j = -2048111; // j to -2,048,111
		k = 4000000002l; // k to 4,000,000,002
		// Note: the l suffix above is required by some compilers
		n = (float) 1.887; //n to 1887
		e = 100;
		Speed_of_light = -1000;
		Speed_of_sound = -40000;
		a = 40000;
		 
		// output content and variables to screen
		System.out.println(SQUARE_ROOT_OF_TWO);
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		System.out.println("n = " + n);
		System.out.println("e (2.7182818) = " + e);
		System.out.println("Speed of light (3.00 x 10^8 m/s) = " + Speed_of_light);
		System.out.println("Speed of sound (340,292 m/s) = " + Speed_of_sound);
		System.out.println("a = " + a);

	}
}	// end of class DataType
