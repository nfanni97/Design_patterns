package prototype;

import java.util.HashMap;
import java.util.Map;

public class ColorPicker {
	HashMap<String, Color> map;
	
	public ColorPicker() {
		map = new HashMap<String, Color>();
		map.put("red", new Color(255,0,0));
		map.put("green", new Color(0,255,0));
		map.put("blue", new Color(0,0,255));
	}
	
	public void set(String name, Color c) {
		map.put(name, c);
	}
	
	public Color get(String name) {
		return map.get(name).clone();
	}
	
	public static void main(String[] args) {
		ColorPicker picker = new ColorPicker();
		//Let's make magenta out of red and add blue
		Color magenta = picker.get("red");
		magenta.setB(255);
		picker.set("mangeta", magenta);
		for (Map.Entry e : picker.map.entrySet()) {
			System.out.println("Key: "+e.getKey() + " & Value: " + e.getValue());
		}
	}

}
