package flyweight;

import java.util.HashMap;

public class PixelFactory {
    private HashMap<Integer,Pixel> flyweights = new HashMap<>();

    public Pixel getFlyweight(int key) {
        if(!flyweights.containsKey(key)) {
            flyweights.put(key, new Pixel(key));
        }
        return flyweights.get(key);
    }
}
