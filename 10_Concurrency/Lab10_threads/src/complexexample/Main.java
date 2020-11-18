package complexexample;

public class Main {

	/**
	 * Létrehozunk két szálat.
	 * Egyik szál esetében a valós rész lesz 0.
	 * Másik szál esetében a képzetes rész lesz 0.
	 * Kiírjuk, ha hibás értéket kaptunk.
	 */
	public static void main(String[] args) {
		Complex complex = new Complex() ;

		Thread1 thread1 = new Thread1(complex) ;
		Thread2 thread2 = new Thread2(complex) ;
		thread1.start() ;
		thread2.start() ;
		while (true)
		{
			double[] x = complex.get() ;
			if (x[0] != 0 && x[1] != 0)
			{
				System.out.println("Hibát találtunk: " + x[0] + " " + x[1]);
			}
		}
	}

}
