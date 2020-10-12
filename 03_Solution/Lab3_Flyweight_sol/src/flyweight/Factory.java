package flyweight;

import java.util.ArrayList;

public class Factory {
	protected TableItem list[];
	public Factory(int size) {
		list = new TableItem[size];
		for (int i = 0; i < size; i++) list[i] = null;
	}
	
	public TableItem getFlyweight(int row) {
		if (list[row]==null) {
			list[row] = new TableItem(row);
		}
		return list[row];
	}
	
	public void cleanup() {
	}
}
