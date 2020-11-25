package templatemethod.templates;

public class WoodenHouse extends BuildingTemplate {

    @Override
    protected void buildFoundation() {
        System.out.println("Built a nice, sturdy foundation.");
    }

    @Override
    protected void buildPillars() {
        System.out.println("Built wooden pillars.");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Built wooden walls.");
    }

    @Override
    protected void buildWindows() {
        System.out.println("Built windows in wooden frames.");
    }

    @Override
    protected void printResult() {
        System.out.println("Built wooden house.");
    }
    
}
