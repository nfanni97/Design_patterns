package pizza;

public class SpicyPizzaBuilder extends PizzaBuilder{
	@Override
	public void buildDough() {
		pizza.setDough("Thick");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("Hot");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Pepperoni and Ham");
	}
}
