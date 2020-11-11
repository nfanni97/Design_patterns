package dp;

public class Main {

	public static void main(String[] args) {
		NewTarget[] shapes = { new LineAdapter(new LegacyLine()), new RectangleAdapter(new LegacyRectangle()) };
		// A begin and end point from a graphical editor
		int x1 = 10, y1 = 20;
		int x2 = 30, y2 = 60;
		for (int i = 0; i < shapes.length; ++i) {
			shapes[i].draw(x1, y1, x2, y2);
		}
	}

}
