package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here
	

	private int a,b;
	String resultString;
	
	Divide(int x, int y)
	{
	a=x;
	b=y;
	}
	
	String getQuotient()
	{
		int quotient=a/b;
		resultString=Integer.toString(quotient);
		return resultString;
	}
	
	String getRemainder()
	{		
		int remainder=a%b;
		resultString=Integer.toString(remainder);
		return resultString;
	}
}
