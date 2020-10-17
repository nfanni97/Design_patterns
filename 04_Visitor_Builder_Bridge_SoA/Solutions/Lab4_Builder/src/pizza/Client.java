package pizza;

public class Client {

	public static void main(String[] args) {
		Waiter waiter= new Waiter();
		PizzaBuilder hawaaian_builder = new HawaiianPizzaBuilder();
		
		waiter.setPizzaBuilder(hawaaian_builder);
		
		waiter.constructPizza();
		
		Pizza mypizza = waiter.getPizza();
		
		System.out.println("Yohoo, we have the following pizza " + mypizza);

	}

}
