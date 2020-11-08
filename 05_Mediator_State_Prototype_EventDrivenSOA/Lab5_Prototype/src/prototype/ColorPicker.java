package prototype;

import java.util.HashMap;

public class ColorPicker {
    private HashMap<String,Color> colors = new HashMap<>();

    public ColorPicker() {
        colors.put("red",new Color(255,0,0));
        colors.put("green",new Color(0,255,0));
        colors.put("blue", new Color(0,0,255));
    }

    public void printColors() {
        colors.forEach((k,v) -> System.out.println("Key: "+k+", Value: "+v));
    }

    public Color getNewColorTemplate(String basedOnThis) {
        if(!colors.containsKey(basedOnThis)) {
            return null;
        }
        return colors.get(basedOnThis).clone();
    }

    public void addColor(String name, Color c) {
        colors.put(name, c);
    }
}
