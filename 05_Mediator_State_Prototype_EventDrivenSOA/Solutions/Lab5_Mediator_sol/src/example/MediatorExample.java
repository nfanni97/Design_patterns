package example;

import java.util.ArrayList;

public class MediatorExample {

	public static void main(String[] args) {
		//Let's add some kids with preset gifts
		TradeBroker broker = new TradeBroker();
		broker.register(new GoodKid("Chocolate"));
		broker.register(new BadKid("Chocolate"));
		broker.register(new BadKid("Coal"));
		
		//And perform a round of trades
		broker.trade();
		
		//Add another new kid
		broker.register(new BadKid("Coal"));
		
		//And perform another round of trades
		broker.trade();
		
	}

}
