package templatemethod.templates;

public class Castle extends BuildingTemplate {

    @Override
    protected void buildFoundation() {
        System.out.println("Built a great foundation with space for a dungeon.");
    }

    @Override
    protected void buildPillars() {
        System.out.println("Building great rock pillars and towers.");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building rock walls and dig moat.");
    }

    @Override
    protected void buildWindows() {
        System.out.println("Built impressive, huge windows.");
    }

    @Override
    protected void printResult() {
        System.out.println("Built castle.");
    }
    
}
