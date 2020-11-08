package prototype;

import java.util.ArrayList;

public class Color {
    private ArrayList<Integer> rgb = new ArrayList<>();

    public Color(int r, int g, int b) {
        rgb.add(r);
        rgb.add(g);
        rgb.add(b);
    }

    public void setR(int r) {
        rgb.set(0, r);
    }

    public void setG(int g) {
        rgb.set(1,g);
    }

    public void setB(int b) {
        rgb.set(2,b);
    }

    public Color clone() {
        return new Color(rgb.get(0).intValue(),rgb.get(1).intValue(),rgb.get(2).intValue());
    }

    @Override
    public String toString() {
        return "Color{"+rgb.get(0)+","+rgb.get(1)+","+rgb.get(2)+"}";
    }
}