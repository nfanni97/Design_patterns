package pizza;

public class Waiter {
	protected PizzaBuilder builder;
	public void setPizzaBuilder(PizzaBuilder pb) {
		builder = pb;
	}
	public Pizza getPizza() {return builder.getPizza();}
	
	public void constructPizza() {
		builder.createNewPizzaProduct();
		builder.buildDough();
		builder.buildSauce();
		builder.buildTopping();
	}
}
