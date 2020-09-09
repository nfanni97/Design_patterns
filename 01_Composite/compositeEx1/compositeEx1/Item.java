package compositeEx1;

public abstract class Item {
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
}
