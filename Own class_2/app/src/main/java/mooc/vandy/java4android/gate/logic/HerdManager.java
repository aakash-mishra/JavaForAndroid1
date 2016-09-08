package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager {
	/**
	 * Reference to the output.
	 */
	private OutputInterface mOut;

	/**
	 * The input Gate object.
	 */
	private Gate mEastGate;

	/**
	 * The output Gate object.
	 */
	private Gate mWestGate;

	/**
	 * Maximum number of iterations to run the simulation.
	 */
	private static final int MAX_ITERATIONS = 10;

	public static final int HERD = 24;

	/**
	 * Constructor initializes the fields.
	 */
	public HerdManager(OutputInterface out,
					   Gate westGate,
					   Gate eastGate) {
		mOut = out;

		mWestGate = westGate;
		mWestGate.open(Gate.IN);

		mEastGate = eastGate;
		mEastGate.open(Gate.OUT);
	}

	void simulateHerd(Random x) {
		int hsize = HERD;
		int pen=x.nextInt(25);
		int pasture= hsize-pen;
		mOut.println("There are currently " +pen+ " snails in the pen and " +pasture+ " snails in the pasture");

		for (int i = 0; i < MAX_ITERATIONS; i++) {
			x.setSeed(1234+i);
			if(pasture==0) {

				int r=x.nextInt(pen)+1;
				pen=pen-r;
				pasture = pasture+r;
				mOut.println("There are currently " +pen+ " snails in the pen and " +pasture+ " snails in the pasture");
			}

			else if(pen==0) {
				int r=x.nextInt(pasture)+1;
				pen= pen + r;
				pasture= pasture - r;
				mOut.println("There are currently " +pen+ " snails in the pen and " +pasture+ " snails in the pasture");
			}

			else {
				int k=x.nextInt(3)%2;

				if(k==0) {
					int r= x.nextInt(pasture)+1;
					pen=pen+r;
					pasture= pasture -r;
					mOut.println("There are currently " +pen+ " snails in the pen and " +pasture+ " snails in the pasture");
				} //select westGate

				if(k==1) {
					int r= x.nextInt(pen)+1;
					pen=pen-r;
					pasture= pasture + r;
					mOut.println("There are currently " +pen+ " snails in the pen and " +pasture+ " snails in the pasture");
				} //select eastGate
			}
			}
		}


	}
