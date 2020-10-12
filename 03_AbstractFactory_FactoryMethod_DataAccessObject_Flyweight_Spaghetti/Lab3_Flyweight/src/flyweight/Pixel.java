package flyweight;
public class Pixel {
	private int row;
	public Pixel(int rowid) {
		row = rowid;
	}
	void report(int col) {
		System.out.print( "  " + row + "," + col);
	}
}