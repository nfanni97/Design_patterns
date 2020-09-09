package compositeEx2.projectItems;
import java.util.ArrayList;

import compositeEx2.contacts.*;

public class Task extends ProjectItem {
    private ArrayList<ProjectItem> items = new ArrayList<>();
    private Contact c;
    private double time;

    public Task(String nameP, String descriptionP, Contact cP, double timeP) {
        super(nameP, descriptionP);
        c = cP;
        time = timeP;
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
        double sum = time;
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
