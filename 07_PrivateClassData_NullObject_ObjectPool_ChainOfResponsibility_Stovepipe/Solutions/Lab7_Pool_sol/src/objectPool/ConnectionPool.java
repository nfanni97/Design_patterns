package objectPool;

import java.util.HashMap;

public class ConnectionPool {
    HashMap<String, DBConnection> pool = new HashMap<String, DBConnection>();
    private ConnectionPool() {};
    static private ConnectionPool instance = null;
    public static ConnectionPool getInstance() {
        if (instance == null) instance = new ConnectionPool();
        return instance;
    }
    public DBConnection getConnection(String s) {
        DBConnection c = pool.get(s);
        if (c==null) {
            c = new DBConnection(s);
            return c;
        }
        else {
            pool.remove(s);
            return c;
        }
    }
    public void releaseConnection(DBConnection c) {
        pool.put(c.getURL(), c);
    }


}
