package objectPool;

public class DBConnection {
	private String url;
	public DBConnection(String _url) {
		this.url = _url;
		System.out.println("Initialising connection to "+this.url);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String query(String q) {
		return "Result of " + q;
	}
	public String getURL() {return url;}
	
	public void close() {
		System.out.println("Closing connection to "+this.url);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
