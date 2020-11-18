package goodexampleforwaiting;

import portemulator.*;

/**
 * Egy jó példa várakozásra.
 */
public class GoodExampleForWaiting {

	public static void main(String[] args) {
		// Port emulátor, majd később megnézzük, hogyan is működik.
		// Lényege, hogy időnként kapunk adatokat rajta keresztül,
		// de általában várni kell.
		PortEmulator port = new PortEmulator(0.5f);

		while (true) {
			synchronized (port) {
				// Folyamatosan próbáljuk lekérdezni, hogy jött-e új adat
				while (port.isEmpty()) {
					try {
						port.wait();
					} catch (InterruptedException e) {
					}
				}
				while(!port.isEmpty()) {
					System.out.println("Adat jött: " + port.get());
				}
			}
		}
	}

}
