package compositeEx1;

public abstract class Item {
    //could be interface, but in the Composite pattern, it's good practice to implement default behavior here
    private String name;

    public String getName() {
        return name;
    }

    public abstract void ls();

    public Item(String n) {
        name = n;
    }

    public void add(Item item) {
    }

    public void remove(Item item) {
    }
}
