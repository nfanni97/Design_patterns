package compositeEx1;

public class File extends Item {

    public File(String n) {
        super(n);
    }

    @Override
    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + getName());
    }
}