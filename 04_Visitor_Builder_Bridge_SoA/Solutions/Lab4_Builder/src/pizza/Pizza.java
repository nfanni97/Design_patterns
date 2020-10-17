package pizza;

public class Pizza {
	protected String dough;
	protected String topping;
	protected String sauce;
	public String getDough() {
		return dough;
	}
	public void setDough(String dough) {
		this.dough = dough;
	}
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public String getSauce() {
		return sauce;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	public String toString() {
		return dough + " " + topping + " " + sauce;
	}
}
