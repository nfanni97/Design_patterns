package lab3.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Household> houses = new ArrayList<>();
        Random r = new Random();
        Person.ageGroups = new ArrayList<>(Arrays.asList(4, 14, 29, 59, 69, 79, 101));
        // Create 100 households, with 5 people each
        for (int i = 0; i < 100; i++) {
            ArrayList<Person> people = new ArrayList<Person>();
            ArrayList<ExtrinsicState> states = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                Person.Sex sex;
                // see if male or female, and set probabilities accordingly
                if (r.nextBoolean()) {
                    sex = Person.Sex.Female;
                } else {
                    sex = Person.Sex.Male;
                }
                Integer age = r.nextInt(100);
                people.add(PersonFactory.getPerson(sex));
                states.add(new ExtrinsicState(age, i * 5 + j));
            }
            houses.add(new Household(people, states, i));
        }

        // Iterate for 100 days
        for (int i = 0; i < 10000; i++) {
            for (Household h : houses) {
                h.newDay();
            }
        }
    }
}
