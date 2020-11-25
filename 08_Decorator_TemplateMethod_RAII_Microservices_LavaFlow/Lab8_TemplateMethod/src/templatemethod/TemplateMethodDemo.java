package templatemethod;

import templatemethod.templates.*;

public class TemplateMethodDemo {

	public static void main(String[] args) {
		WoodenHouse house = new WoodenHouse();
		house.buildBuilding();
		Castle castle = new Castle();
		castle.buildBuilding();
	}

}
