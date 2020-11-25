package templatemethod;

public abstract class HouseTemplate {
	
	void build(){
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built.");
	}
	protected void buildFoundation(){
		System.out.println("Build proper foundation.");
	}
	protected abstract void buildPillars();
	protected abstract void buildWalls();
	
	protected void buildWindows(){
		System.out.println("Adding Glass windows.");
	}
}
