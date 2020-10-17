package hw6;

import java.util.ArrayList;

public class Employee {
    private final String name;
    private ArrayList<String> rules;

    public Employee(String n, ArrayList<String> r) {
        name = n;
        rules = r;
    }

    public void addRule(String page) {
        rules.add(page);
    }

    public ArrayList<String> getRules() {
        return rules;
    }

    public String getName() {
        return name;
    }
}
