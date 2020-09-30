package flyweight;
public class TableItem {
	private int        row;
	public TableItem( int _row ) {
		System.out.println("new tableItem constructed");
		row = _row;	}
	void report(int col) {
		System.out.print( " " + row + "," +col );
	}
}