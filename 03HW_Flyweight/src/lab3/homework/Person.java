package lab3.homework;

import java.util.ArrayList;
import java.util.Random;

public class Person {
    public enum Sex {Male, Female};
    public static ArrayList<Integer> ageGroups;
    ArrayList<Double> probabilityHospital;
    ArrayList<Double> probabilityHospitalDeath;
    ArrayList<Double> probabilitySuddenDeath;
    Sex sex;

    public Person(ArrayList<Double> probsHospital, ArrayList<Double> probsHospitalDeath,
                  ArrayList<Double> probsSuddenDeath, Sex sex) {
        this.probabilityHospital = probsHospital;
        this.probabilitySuddenDeath = probsSuddenDeath;
        this.probabilityHospitalDeath = probsHospitalDeath;
        this.sex = sex;
    }

    /**
     * A method computing what happens to a person that day
     * @return a String describing what happened (if anything)
     */
    public String newDay(ExtrinsicState state) {
        //If dead, do nothing
        if (state.getDead()) return "";

        //Calculate what age group this person belongs to
        int myGroup = 0;
        while (state.getAge() > ageGroups.get(myGroup)) {
            myGroup++;
        }

        // create random object
        Random randomno = new Random();

        if (state.getDaysInHospital()>0) { //If still in hospital, reduce days left in hospital
            state.setDaysInHospital(state.getDaysInHospital()-1);
        } else if (state.getDaysInHospital() == 0) { //If at the end of hospital stay, see if dies or lives
            state.setDaysInHospital(state.getDaysInHospital()-1);
            if (randomno.nextDouble() < probabilityHospitalDeath.get(myGroup)) {
                state.setDead(true);
                return "Agent "+state.getIndex()+" ("+sex+", age: "+state.getAge()+") died in hospital";
            }
        } else { //Person not in hospital
            //Chance of sudden death
            if (randomno.nextDouble() < probabilitySuddenDeath.get(myGroup)) {
                state.setDead(true);
                return "Agent "+state.getIndex()+" ("+sex+", age: "+state.getAge()+") died a sudden death";
            } else {
                //Chance of hospitalization
                if (randomno.nextDouble() < probabilityHospital.get(myGroup)) {
                    state.setDaysInHospital(6);
                    return "Agent "+state.getIndex()+" ("+sex+", age: "+state.getAge()+" hospitalized";
                }
            }
        }
        return "";
    }
}
