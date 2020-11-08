package pizza;

public class HawaiianPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough("Thick");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("Mild");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Ham and pineapple");
	}

}
