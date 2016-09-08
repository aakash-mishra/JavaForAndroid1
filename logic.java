package mooc.vandy.java4android.diamonds.logic;

import android.util.Log;
import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void decor(int size)
    {
        mOut.print("+");
        for(int i=0;i<2*size;i++)
        {
            mOut.print("-");
        }
        mOut.println("+");
    }

    public void hyphenOrEquals(int i)
    {
        for(int j=0;j<2*i;j++)
        {
            if(i%2==0) //"-" or "="
                mOut.print("=");
            else
                mOut.print("-");
        }

    }

    public void printSpaceTop(int i,int size)
    {
        for(int c=0;c<size-i-1;c++)//spaces
        {
            mOut.print(" ");
        }
    }

    public void printSpaceBottom(int k)
    {
        for(int c=0;c<k+1;c++) //Spaces
        {
            mOut.print(" ");
        }
    }


    public void process(int size) {


        int i;

        decor(size);

        for(i=0;i<=(size-1);i++)
        {


            if(i==size-1)
            {
                mOut.print("|");
                mOut.print("<");

                hyphenOrEquals(i);

                mOut.print(">");
                mOut.println("|");


            }

            else
            {
                mOut.print("|");
                printSpaceTop(i,size);

                mOut.print("/");

                hyphenOrEquals(i);


                mOut.print("\\");

                printSpaceTop(i,size);
                mOut.println("|");
            }
        }


        for(int k=0;k<(size-1);k++) //Bottom Half
        {
            mOut.print("|");
            printSpaceBottom(k);

            mOut.print("\\");



            for(int j=0;j<2*(size-k)-4;j++) //"-" or "="

            {
                if(size%2==0)
                {
                    if(k%2==0)
                    {
                        mOut.print("=");
                    }
                    else if(k%2!=0)
                    {
                        mOut.print("-");
                    }
                }

                else if(size%2!=0)
                {
                    if(k%2==0)
                    {
                        mOut.print("-");
                    }
                    else if(k%2!=0)
                    {
                        mOut.print("=");
                    }
                }
            }

            mOut.print("/");

            printSpaceBottom(k);

            mOut.println("|");

        }

        decor(size);

    }

}
