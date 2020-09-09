package compositeEx2;

import java.util.ArrayList;

public class Project extends Component {
    private String name;
    private String desc;
    private ArrayList<Component> projectItems = new ArrayList<>();

    public Project(String n, String d) {
        name = n;
        desc = d;
    }

    @Override
    public String getDescription(int level) {
        String prefix = "\t".repeat(level);
        String description = prefix + "PROJECT: " + name + "\n";
        for (Component c : projectItems) {
            description += c.getDescription(level + 1);
        }
        return description;
    }

    @Override
    public void addProjectItem(Component component) {
        projectItems.add(component);
    }

    @Override
    public double getTimeNeeded() {
        double sum = 0.0;
        for (Component c : projectItems) {
            sum += c.getTimeNeeded();
        }
        return sum;
    }
}
