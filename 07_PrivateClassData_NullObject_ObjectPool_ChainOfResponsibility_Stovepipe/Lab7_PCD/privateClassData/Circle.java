package privateClassData;

import java.awt.Color;
import java.awt.Point;

public class Circle {
	private class PrivateCricleData {
		private double radius;
		private Color color;
		private Point origin;

		PrivateCricleData(double r, Color c, Point p) {
			radius = r;
			color = c;
			origin = p;
		}

		double getRadius() {
			return radius;
		}
	}
	private PrivateCricleData data;
	public Circle(double radius, Color color, Point origin) {
		data = new PrivateCricleData(radius, color, origin);
	}
	public double Circumference() {
		return 2 * Math.PI * data.getRadius();
	}
	public double Diameter() {
		return 2 * data.getRadius();
	}
	public void Draw() {
		System.out.println("Drawing...\n");
		//I can mess around with things I shouldn't be able to change
		// radius += 1;
	}
	public static void main(String[] args) {
		Circle myc = new Circle(5, new Color(1, 0, 0), new Point(20, 20));
		myc.Draw();
	}

}
