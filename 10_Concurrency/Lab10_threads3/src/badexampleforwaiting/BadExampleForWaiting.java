package badexampleforwaiting;

import portemulator.*;

/**
 * Egy rossz példa várakozásra.
 */
public class BadExampleForWaiting {

	public static void main(String[] args) {
		// Port emulátor, majd később megnézzük, hogyan is működik.
		// Lényege, hogy időnként kapunk adatokat rajta keresztül, 
		// de általában várni kell.
		PortEmulator port = new PortEmulator(0.5f);
		
		while(true)
		{
			// Folyamatosan próbáljuk lekérdezni, hogy jött-e új adat
			while (!port.isEmpty())
			{
				// Ha jött adat, akkor amíg ki nem szedek mindent
				System.out.println("Adat jött: "+port.get());
			}
		}
	}

}
