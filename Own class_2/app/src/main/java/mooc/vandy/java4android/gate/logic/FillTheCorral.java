package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }
    void setCorralGates(Gate[] gate, Random selectDirection)
    {

        for(int i=0;i<gate.length;i++) {
            int ans= selectDirection.nextInt(3);

            if (ans==0)
            {
                gate[i].open(Gate.IN);
            }

            if(ans==1)
            {
                gate[i].open(Gate.OUT);
            }

            if (ans==2)
            {
                gate[i].close();
            }
        }


        }



    boolean anyCorralAvailable(Gate[] corral)
    {
        int flag=0;

    for(int i=0;i<corral.length;i++)
    {
        if(corral[i].getSwingDirection()==1)
        {
           flag=1;
            break;
        }
    }
        if(flag==1)

        return true;

        else

        return false;

    }



    int corralSnails(Gate[] corral, Random rand)
    {
    int pasture=5;
        int attempt=0;

        while(pasture!=0 && pasture!=10)
        {

         int s= rand.nextInt(pasture)+1; //4,5,1,3
         int G= rand.nextInt(corral.length); //3,1,1,0
         mOut.println(s+" are trying to  move through corral "+G);
            attempt++;
         int ans= corral[G].thru(s);
            if(Integer.signum(ans)==1) //swing in
            {
              pasture=pasture-s;
            }

            else if(Integer.signum(ans)==-1) //Gate is open to swing out
            {
                pasture=pasture+s;
            }


        }

        mOut.println("It took "+attempt+" attempts to corral all of the snails");

        return attempt;

    }


    // TODO -- Fill your code in here

}
