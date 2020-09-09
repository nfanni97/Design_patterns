package compositeEx2.projectItems;

public abstract class ProjectItem {
    private String name;
    private String description;

    protected ProjectItem(String nameP, String descriptionP) {
        name = nameP;
        description = descriptionP;
    }

    public String getDescription() {
        return name + ": " + description + "\n";
    }

    public double getTimeNeeded() {
        return 0;
    }

    public abstract void addProjectItem(ProjectItem e);
}
