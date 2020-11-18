package complexexample;

import java.util.Random;

public class Thread1 extends Thread {

	private Complex complex;

	public Thread1(Complex complex) {
		this.complex = complex;		
	}

	@Override
	public void run() {
		Random rand = new Random() ;
		while (true)
		{
			// Valós rész mindig 0
			complex.set(0, rand.nextInt(100)) ;
		}
	}

}
