package compositeEx1;

import java.util.ArrayList;

public class Directory extends Item {
    private ArrayList<Item> includedFiles = new ArrayList<>();

    public Directory(String n) {
        super(n);
    }

    @Override
    public void add(Item item) {
        includedFiles.add(item);
    }

    @Override
    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + getName());
        CompositeDemo.compositeBuilder.append("   ");
        for (Item obj : includedFiles) {
            obj.ls();
        }
        CompositeDemo.compositeBuilder.setLength(CompositeDemo.compositeBuilder.length() - 3);
    }
}