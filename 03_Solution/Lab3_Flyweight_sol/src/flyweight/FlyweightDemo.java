package flyweight;

public class FlyweightDemo {
	public static final int ROWS = 6, COLS = 10;

	public static void main( String[] args ) {
		Factory factory = new Factory(ROWS);
		
		for (int i=0; i < ROWS; i++) {
			for (int j=0; j < COLS; j++)
				factory.getFlyweight(i).report(j);
			System.out.println();
		}
		factory.cleanup();
	}
}