package pizza;

public abstract class PizzaBuilder {
	public abstract void buildDough();
	public abstract void buildSauce();
	public abstract void buildTopping();
	
	public void createNewPizzaProduct() {pizza = new Pizza();}
	
	protected Pizza pizza;
	
	public Pizza getPizza() {return pizza;}
}
