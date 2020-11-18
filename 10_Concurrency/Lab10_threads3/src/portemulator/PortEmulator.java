package portemulator;

import java.util.*;

/**
 * Port emulátor
 * 
 * Néha véletlenszerűen betesz adatokat a sorába, amiket ki lehet venni. Hasonló
 * ahhoz, mintha egy hálózati kapcsolatunk lenne, ahonnan néha jönnek adatok.
 */
public class PortEmulator extends Thread {
	// Egy másodpercben ilyen valószínűséggel generálódik adat
	float probability;

	// A sorunk
	Queue<Integer> queue = new LinkedList<Integer>();

	public void run() {
		Random generator = new Random();

		while (true) {
			int s = generator.nextInt(100);
			if (s < probability * 100) {
				synchronized (this) {
					queue.offer(generator.nextInt(1000));
					notifyAll();
				}
			}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public PortEmulator(float p) {
		probability = p;
		start();
	}

	public boolean isEmpty() {
		synchronized(queue) {
			return queue.isEmpty();
		}
	}

	public int get() {
		synchronized(queue) {
		int toreturn = queue.poll();
		return toreturn;
		}
	}

}
