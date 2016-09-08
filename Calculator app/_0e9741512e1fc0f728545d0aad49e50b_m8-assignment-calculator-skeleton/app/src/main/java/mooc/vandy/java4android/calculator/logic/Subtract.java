package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    

	private int a,b;
	
	
	Subtract(int x, int y)
	{
	a=x;
	b=y;
	}
	
	String getSub()
	{
		String resultString;
		int sub=a-b;
		resultString=Integer.toString(sub);
		return resultString;
	}
	
}
