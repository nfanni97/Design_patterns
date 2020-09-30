package visitor;

public class CountVisitor implements Visitor {
    private int blueCount = 0;
    private int redCount = 0;

    @Override
    public void visitBlue(Blue b) {
        blueCount++;
    }

    @Override
    public void visitRed(Red r) {
        redCount++;
    }

    public void reportNum() {
        System.out.println("Reds "+redCount+", blues "+blueCount);
    }
    
}
