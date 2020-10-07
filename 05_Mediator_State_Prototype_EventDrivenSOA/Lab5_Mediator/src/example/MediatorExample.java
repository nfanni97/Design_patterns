package example;

import java.util.ArrayList;

public class MediatorExample {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();

		for(int i=0;i<mediator.numOfKids();i++){
			for(int j=i+1;j<mediator.numOfKids();j++){
				mediator.trade(i,j);
				// Kid a = kids.get(i);
				// Kid b = kids.get(j);
				// System.out.println(a.getGift() + " <-> " + b.getGift());
				// a.acquirePair(b);
				// a.trade();
				// System.out.println(a.getGift() + " <-> " + b.getGift());
				// a.releasePair();
			}
		}
		
		/*
		 * It'd be better if there was some central Mediator that could organize trades more efficiently.
		 * Make it so that it only lets trades happen which actually result in a chocolate <-> coal switch.
		 */
		
	}

}
