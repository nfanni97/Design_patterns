package compositeEx2.projectItems;

import java.util.ArrayList;

public class Project extends ProjectItem {
    private ArrayList<ProjectItem> items = new ArrayList<>();

    public Project(String nameP, String descriptionP) {
        super(nameP, descriptionP);
    }

    @Override
    public String getDescription() {
        StringBuilder ret = new StringBuilder();
        ret.append(super.getDescription());
        for(ProjectItem e : items) {
            ret.append(e.getDescription());
        }
        return ret.toString();
    }

    @Override
    public double getTimeNeeded() {
        double sum = 0;
        for(ProjectItem e : items) {
            sum += e.getTimeNeeded();
        }
        return sum;
    }

    @Override
    public void addProjectItem(ProjectItem e) {
        items.add(e);
    }
}
