package framework;

public abstract class Document {
	public Document(String s) {
		name = s;
	}
	public abstract void displayDocument();
	public abstract void openDocument();
	String getName() {return name;}
	protected String name;
}
