package lab3.homework;

import java.util.ArrayList;
import java.util.HashMap;

public class Household {
    HashMap<Person, ExtrinsicState> inhabitants;
    Integer index;

    public Household(ArrayList<Person> people, ArrayList<ExtrinsicState> states, Integer index) {
        this.inhabitants = new HashMap<>();
        for (int i = 0; i < people.size(); i++) {
            inhabitants.put(people.get(i), states.get(i));
        }
        this.index = index;
    }

    public void newDay() {
        Boolean printed = false;
        for (Person e : inhabitants.keySet()) {
            String state = e.newDay(inhabitants.get(e));
            if (state.length() > 0) {
                if (!printed) {
                    System.out.println("Household " + index);
                    printed = true;
                }
                System.out.println(state);
            }
        }
    }
}
