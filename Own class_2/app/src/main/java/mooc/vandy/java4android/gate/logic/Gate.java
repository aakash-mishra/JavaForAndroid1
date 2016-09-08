package mooc.vandy.java4android.gate.logic;
/**
 * This file defines the Gate class.
 */
public class Gate {
    // TODO -- Fill in your code here

    public static final int IN=1, OUT=-1, CLOSED=0;
    private int mSwing=0;


    int getSwingDirection()
    {
        return mSwing;
    }

    boolean setSwing(int direction)
    {
        if(direction==IN || direction==OUT)
        {
            mSwing=direction;
            return true;
        }

        else {
            mSwing=direction;
            return false;
        }
    }

    boolean open(int direction)
    {
        if(direction==IN || direction==OUT)
        {
            setSwing(direction);
            return true;
        }
        else
            return false;
    }

    void close()
    {
        mSwing=CLOSED;
    }

    int thru(int count)
    {
        if(mSwing==IN)
        {
            return (count);
        }
        else if(mSwing==OUT)
        {
            return(-count);
        }

        else
            return 0;
    }



    public String toString()
    {
        if(mSwing==CLOSED)

            return("This gate is closed");
// a gate that is closed
        else if(mSwing==IN)

            return("This gate is open and swings to enter the pen only");
// a gate that has opened to swing IN
        else if(mSwing==OUT)

            return("This gate is open and swings to exit the pen only");
// a gate that been opened swing OUT
        else
            return("This gate has an invalid swing direction");
// a gate that has a swing value other than IN, OUT, or CLOSED
    }


}
