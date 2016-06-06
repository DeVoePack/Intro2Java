class Paren
{
	public static void main(String args[])
	{
		float a = (float) 2 + 6 / 3 + 1 * 6 - 7;
		float b = (float) (2 + 6) / (3 + 1) * 6 - 7;
		float c = (float) (2 + 6) / (3 + 1) * (6 - 7);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}