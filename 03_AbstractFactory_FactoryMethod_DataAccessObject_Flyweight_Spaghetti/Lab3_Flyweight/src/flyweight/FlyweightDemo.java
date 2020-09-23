package flyweight;

public class FlyweightDemo {
	public static final int ROWS = 6, COLS = 10;

	public static void main( String[] args ) {
		Pixel[][] matrix = new Pixel[ROWS][COLS];
		PixelFactory factory = new PixelFactory();
		for (int i=0; i < ROWS; i++)
			for (int j=0; j < COLS; j++)
				matrix[i][j] = factory.getFlyweight(i);
		for (int i=0; i < ROWS; i++) {
			for (int j=0; j < COLS; j++)
				matrix[i][j].report(j);
			System.out.println();
		}  
	}
}