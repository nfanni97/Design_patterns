package example;

import java.util.ArrayList;

public class Mediator {
    private ArrayList<Kid> kids = new ArrayList<>();

    public Mediator() {
        kids.add(new GoodKid("Chocolate"));
        kids.add(new BadKid("Chocolate"));
        kids.add(new BadKid("Coal"));
    }

    public int numOfKids() {
        return kids.size();
    }

    // trade between i-th and j-th kid
    // BUT only if one has chocolate and the other has coal!
    public void trade(int i, int j) {
        if (i == j) {
            return;
        }
        if (i >= kids.size() || j >= kids.size()) {
            return;
        }
        if(kids.get(i).getGift().equals(kids.get(j).getGift())) {
            return;
        }
        String temp = kids.get(i).getGift();
        kids.get(i).setGift(kids.get(j).getGift());
        kids.get(j).setGift(temp);
        System.out.println("Trade between "+i+" and "+j);
    }
}
