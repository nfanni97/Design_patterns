package facMeth;

import framework.Document;

public class MyDocument extends Document {

	public MyDocument(String s) {
		super(s);
	}

	@Override
	public void displayDocument() {
		System.out.println("MyDocument displaying");
	}

	@Override
	public void openDocument() {
		System.out.println("Opening a MyDocument");
	}

}
