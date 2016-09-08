package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {

    private int a,b;


	Add(int x, int y)
	{
	a=x;
	b=y;
	}
	
	String getSum()
	{
		String resultString;
		int sum=a+b;
		resultString=Integer.toString(sum);
		return resultString;
	}


	
}
