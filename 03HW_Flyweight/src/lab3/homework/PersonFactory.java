package lab3.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import lab3.homework.Person.Sex;

public class PersonFactory {
    private static HashMap<Person.Sex, Person> flyweights = new HashMap<>();

    //only 2 flyweights -> can be created beforehand
    static {
        flyweights.put(Sex.Female,
                new Person(
                        new ArrayList<>(Arrays.asList(0.000116508, 5.8254E-05, 0.000452839, 0.00083018, 0.000361234,
                                0.000542418, 0.000785243)),
                        new ArrayList<>(Arrays.asList(0.004496926, 0.002248463, 0.006745389, 0.0085665, 0.013942758,
                                0.020936024, 0.030308462)),
                        new ArrayList<>(Arrays.asList(2.03327E-07, 2.03327E-07, 2.03327E-07, 1.19385E-06, 8.87187E-06,
                                1.97007E-05, 9.73804E-05)),
                        Sex.Female));
        flyweights.put(Sex.Male,
                new Person(
                        new ArrayList<>(Arrays.asList(3.79825E-07, 3.79825E-07, 3.79825E-07, 3.84118E-06, 2.00505E-05,
                                3.47985E-05, 0.000105441)),
                        new ArrayList<>(Arrays.asList(0.008400475, 0.004200238, 0.012600713, 0.027562562, 0.031510735,
                                0.036980507, 0.032817199)),
                        new ArrayList<>(Arrays.asList(3.79825E-07, 3.79825E-07, 3.79825E-07, 3.84118E-06, 2.00505E-05,
                                3.47985E-05, 0.000105441)),
                        Sex.Male));
        System.out.println(flyweights);
    }

    public static Person getPerson(Person.Sex sex) {
        return flyweights.get(sex);
    }
}
