package hw6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Rules {
    //key: status
    //value: restricted pages
    static HashMap<String,ArrayList<String>> defaultFilters = new HashMap<>();
    static {
        defaultFilters.put("boss", new ArrayList<>());
        defaultFilters.put("manager", new ArrayList<>(Arrays.asList("facebook")));
        defaultFilters.put("employee", new ArrayList<>(Arrays.asList("facebook", "youtube")));
    }

    public ArrayList<String> getDefaultFilterList(String name) {
        if(defaultFilters.containsKey(name)) {
            return (ArrayList<String>) defaultFilters.get(name).clone();
        } else {
            return null;
        }
    }

    public void addDefaultFilterList(String name, ArrayList<String> l) {
        defaultFilters.put(name, l);
    }
}
