package visitor;

public class CountingVisitor implements Visitor{
    protected int s_num_red=0, s_num_blue=0;

    @Override
    public void doRed(Red r) {
        s_num_red++;
    }

    @Override
    public void doBlue(Blue r) {
        s_num_blue++;
    }

    public void report() {
        System.out.println("Reds " + s_num_red + ", Blues " + s_num_blue);
    }
}
