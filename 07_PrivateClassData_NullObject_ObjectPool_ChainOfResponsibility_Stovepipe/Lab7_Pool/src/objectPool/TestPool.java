package objectPool;

public class TestPool {

	public static void main(String[] args) {
		//In practice these queries would be spread throughout your application, not in a single code block
		
		//Open a new connection
		DBConnection c1 = ConnectionPool.acquireConnection("some_db::far_away");
		//Let's query something
		System.out.println(c1.query("SELECT * FROM people"));
		ConnectionPool.releaseConnection(c1);
		
		//Open a new connection
		DBConnection c2 = ConnectionPool.acquireConnection("some_db::far_away");
		//Let's query something
		System.out.println(c2.query("SELECT * FROM people WHERE age > 10"));
		ConnectionPool.releaseConnection(c2);

		//We are done, close connections
		ConnectionPool.closeConnections();
	}

}
