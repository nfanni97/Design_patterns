package dp;

public class LineAdapter implements NewTarget {
    private LegacyLine adaptee;

    public LineAdapter(LegacyLine a) {
        adaptee = a;
    }

    @Override
    public void draw(int startX, int startY, int endX, int endY) {
        adaptee.draw(startX, startY, endX, endY);
    }
    
}
