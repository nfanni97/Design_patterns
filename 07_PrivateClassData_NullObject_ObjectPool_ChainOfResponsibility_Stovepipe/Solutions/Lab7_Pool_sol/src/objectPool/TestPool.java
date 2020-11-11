package objectPool;

public class TestPool {

	public static void main(String[] args) {
		//In practice these queries would be spread throughout your application, not in a single code block
		
		//Open a new connection
		DBConnection c1 = ConnectionPool.getInstance().getConnection ("some_db::far_away");
		//Let's query something
		System.out.println(c1.query("SELECT * FROM people"));
		//We are done, close the connection
		ConnectionPool.getInstance().releaseConnection(c1);
		
		//Open a new connection
		DBConnection c2 = ConnectionPool.getInstance().getConnection ("some_db::far_away");
		//Let's query something
		System.out.println(c2.query("SELECT * FROM people WHERE age > 10"));
		//We are done, close the connection
		ConnectionPool.getInstance().releaseConnection(c1);
	}

}
