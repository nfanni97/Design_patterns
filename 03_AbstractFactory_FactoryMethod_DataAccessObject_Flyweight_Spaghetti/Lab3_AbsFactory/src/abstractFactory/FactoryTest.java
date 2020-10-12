package abstractFactory;

import java.util.Scanner;

public class FactoryTest {

	public static void main(String[] args) {
		System.out.print("1 - Simple 2 - Robust : ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		Shape rect;
		Shape circ;
		AbstractFactory factory;
		if (input.equals("1")) {
			factory = new SimpleFactory();
		} else {
			factory = new ComplexFactory();
		}
		rect = factory.CreateCorneredObject();
		circ = factory.CreateCircularObject();
		circ.draw();
		rect.draw();
	}

}
