package abstractFactory;

import java.util.Scanner;

public class FactoryTest {

	public static void main(String[] args) {
		System.out.print("1 - Simple 2 - Robust : ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		AbsFactory factory;
		if (input.equals("1")) {
			factory = new SimpleFactory();
		} else {
			factory = new RobustFactory();
		}

		//Let's create a Rectangular shape:
		Shape rect = factory.getRectangular();
		rect.draw();
		
		//Now let's create a circular shape:
		Shape circ = factory.getCircular();
		circ.draw();

	}

}
