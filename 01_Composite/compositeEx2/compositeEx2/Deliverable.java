package compositeEx2;

public class Deliverable extends Component {
    private String name;
    private String desc;
    private Contact owner;

    public Deliverable(String n, String d, Contact c) {
        name = n;
        desc = d;
        owner = c;
    }

    @Override
    public String getDescription(int level) {
        String prefix = "\t".repeat(level);
        return prefix + "DELIVERABLE: " + name + "\n";
    }
}
