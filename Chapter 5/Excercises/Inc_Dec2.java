// start of Inc_Dec2.java
class Inc_dec2
{
	public static void main(String Args[])
	{
		int j;
		j = 10;
		j++;
		System.out.println ("j = " + j);
		j--;
		System.out.println("j = " + j);
		int k;
		k = j++;
		System.out.println("k = " + k);
		System.out.println("j = " + j);
		k = ++j;
		System.out.println("k = " + k);
		System.out.println("j = " + j);
		int i;
		i = 4;
		j = --i;
		System.out.println("j = " + j);
		j = 3 + 4 / 2 + 5 * 2 - 3;
		System.out.println("j = " + j);
		j = (3 + 4) / (2 + 5) * 2 - 3;
		System.out.println("j = " + j);
	}
}	// end of class Inc_Dec2.java