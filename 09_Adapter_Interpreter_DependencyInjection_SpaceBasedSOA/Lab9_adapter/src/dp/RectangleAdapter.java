package dp;

public class RectangleAdapter implements NewTarget {
    private LegacyRectangle adaptee;

    public RectangleAdapter(LegacyRectangle a) {
        adaptee = a;
    }

    @Override
    public void draw(int startX, int startY, int endX, int endY) {
        adaptee.draw(Math.min(startX,endX), Math.min(startY, endY), Math.abs(endX-startX), Math.abs(endY-startY));
    }
    
}
