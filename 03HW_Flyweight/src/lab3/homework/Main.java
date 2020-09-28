package lab3.homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Household> houses = new ArrayList<>();
        Random r = new Random();
        Person.ageGroups = new ArrayList<>(Arrays.asList(4,14,29,59,69,79,101));
        //Create 100 households, with 5 people each
        for (int i = 0; i < 100; i++) {
            ArrayList<Person> people = new ArrayList<Person>();
            for (int j = 0; j < 5; j++) {
                ArrayList<Double> probsSuddenDeath;
                ArrayList<Double> probsHospital;
                ArrayList<Double> probsHospitalDeath;
                Person.Sex sex;
                //see if male or female, and set probabilities accordingly
                if (r.nextBoolean()) {
                    sex = Person.Sex.Female;
                    probsSuddenDeath = new ArrayList<>(Arrays.asList(2.03327E-07,2.03327E-07,2.03327E-07,1.19385E-06,8.87187E-06,1.97007E-05,9.73804E-05));
                    probsHospital = new ArrayList<>(Arrays.asList(0.000116508, 5.8254E-05, 0.000452839, 0.00083018, 0.000361234, 0.000542418, 0.000785243));
                    probsHospitalDeath = new ArrayList<>(Arrays.asList(0.004496926, 0.002248463, 0.006745389, 0.0085665, 0.013942758, 0.020936024, 0.030308462));
                } else {
                    sex = Person.Sex.Male;
                    probsSuddenDeath = new ArrayList<>(Arrays.asList(3.79825E-07, 3.79825E-07, 3.79825E-07, 3.84118E-06, 2.00505E-05, 3.47985E-05, 0.000105441));
                    probsHospital = new ArrayList<>(Arrays.asList(0.000217643, 0.000108821, 0.000845925, 0.00267109, 0.000816392, 0.000958105, 0.00085024));
                    probsHospitalDeath = new ArrayList<>(Arrays.asList(0.008400475, 0.004200238, 0.012600713, 0.027562562, 0.031510735, 0.036980507, 0.032817199));
                }
                Integer age = r.nextInt(100);
                people.add(new Person(probsHospital,probsHospitalDeath,probsSuddenDeath,age,sex,i*5+j));
            }
            houses.add(new Household(people,i));
        }

        //Iterate for 100 days
        for (int i = 0; i < 10000; i++) {
            for (Household h : houses) {
                h.newDay();
            }
        }
    }
}
