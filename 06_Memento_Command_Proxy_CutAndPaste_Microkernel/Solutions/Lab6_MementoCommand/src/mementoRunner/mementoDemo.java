package mementoRunner;

import java.util.Scanner;

import mementoDemo.Calculator;
import mementoDemo.Memento;

public class mementoDemo {
    public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please give the intial value:");
		Calculator calc = new Calculator(scanner.nextDouble());
		
		Command[] commands = new Command[2];
		commands[0] = new Command(calc, 1);
		commands[1] = new Command(calc, 2);
		
		Memento mem = null;
		while (true) {
			System.out.println("What should I do: 1 - double, 2 - halve, 3 - undo, 4 - redo");
			int nextStep = scanner.nextInt();
			if (nextStep == 1) {
				commands[0].execute();
			} else if (nextStep == 2) {
				commands[1].execute();
			} else if (nextStep == 3) {
				Command.undo();
			} else if (nextStep == 4) {
				Command.redo();
			} else break;
			System.out.println("Current value:" + calc.getValue());
		}
		scanner.close();
    }
}
