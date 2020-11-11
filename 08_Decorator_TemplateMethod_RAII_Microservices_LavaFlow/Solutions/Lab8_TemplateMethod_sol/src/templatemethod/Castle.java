package templatemethod;

public class Castle extends HouseTemplate {

	@Override
	protected void buildPillars() {
		System.out.println("Building great rock pillars and towers.");

	}

	@Override
	protected void buildWalls() {
		System.out.println("Building rock walls and dig moat.");

	}

}
