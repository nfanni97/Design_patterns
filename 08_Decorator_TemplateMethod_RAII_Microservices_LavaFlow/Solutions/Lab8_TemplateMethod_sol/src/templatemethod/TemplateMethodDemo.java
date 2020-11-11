package templatemethod;

public class TemplateMethodDemo {

	public static void main(String[] args) {
		HouseTemplate t = new WoodenHouse();
		t.build();
		t = new Castle();
		t.build();

	}

}
