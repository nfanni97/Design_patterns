package compositeEx2;

import java.util.ArrayList;

public class Task extends Component {
    private String name;
    private String details;
    private Contact owner;
    private double timeToComplete;
    private ArrayList<Component> projectItems = new ArrayList<>();

    public Task(String n, String d, Contact o, double t) {
        name = n;
        details = d;
        owner = o;
        timeToComplete = t;
    }

    @Override
    public void addProjectItem(Component component) {
        projectItems.add(component);
    }

    @Override
    public double getTimeNeeded() {
        double sum = timeToComplete;
        for (Component c : projectItems) {
            sum += c.getTimeNeeded();
        }
        return sum;
    }

    @Override
    public String getDescription(int level) {
        String prefix = "\t".repeat(level);
        String d = prefix + "TASK: " + name + "\n";
        for (Component c : projectItems) {
            d += c.getDescription(level + 1);
        }
        return d;
    }
}
