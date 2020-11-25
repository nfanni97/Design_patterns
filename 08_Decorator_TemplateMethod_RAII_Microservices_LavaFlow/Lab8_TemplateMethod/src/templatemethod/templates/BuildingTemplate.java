package templatemethod.templates;

public abstract class BuildingTemplate {

	public void buildBuilding() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		printResult();
	}

	protected abstract void buildFoundation();

	protected abstract void buildPillars();

	protected abstract void buildWalls();

	protected abstract void buildWindows();

	protected abstract void printResult();
}
