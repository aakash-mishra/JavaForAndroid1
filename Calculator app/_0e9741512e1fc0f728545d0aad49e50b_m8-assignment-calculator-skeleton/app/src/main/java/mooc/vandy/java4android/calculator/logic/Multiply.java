package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    

	private int a,b;

	
	Multiply(int x, int y)
	{
	a=x;
	b=y;
	}
	
	String getMul()
	{
		String resultString;
		int mul=a*b;
		resultString=Integer.toString(mul);
		return resultString;

	}
}
