package compositeEx2;

public abstract class Component {

    public void addProjectItem(Component component) {
    }

    public double getTimeNeeded() {
        return 0;
    }

    public String getDescription() {
        return getDescription(0);
    }

    protected abstract String getDescription(int level);
}