package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){


        if(operation==1)
		{
		Add a=new Add(argumentOne,argumentTwo);
		mOut.print(a.getSum());
		}
		
		if(operation==2)
		{
		Subtract b=new Subtract(argumentOne,argumentTwo);
		mOut.print(b.getSub());		
		}
		
		if(operation==3)
		{
		if(argumentOne==0 || argumentTwo==0) //if one of the operands is zero the result is zero.
		{
		mOut.print("0");
		}
		Multiply c=new Multiply(argumentOne,argumentTwo);
		mOut.print(c.getMul());		
			
		}
		
		if(operation==4)
		{
			
		if(argumentTwo==0) //division by zero throws an exception and crashes the app.
		{
			mOut.print("Cannot divide a number by zero");
		}

		else
		{
		Divide d=new Divide(argumentOne,argumentTwo);
		mOut.print(d.getQuotient()+" R: " + d.getRemainder());
		}
		
		
			
		}
		
    }
}
