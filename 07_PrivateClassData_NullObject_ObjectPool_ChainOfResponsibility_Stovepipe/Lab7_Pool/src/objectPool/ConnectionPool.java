package objectPool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConnectionPool {
    private static HashMap<String, ArrayList<DBConnection>> connections = new HashMap<>();

    public static DBConnection acquireConnection(String _url) {
        if(!connections.containsKey(_url)) {
            connections.put(_url, new ArrayList<DBConnection>());
        }
        if(connections.get(_url).isEmpty()) {
            DBConnection newConnection = new DBConnection(_url);
            connections.get(_url).add(newConnection);
        }
        return connections.get(_url).remove(0);
    }

    public static void releaseConnection(DBConnection connection) {
        // got connection from the pool -> _url surely exists in the map
        connections.get(connection.getURL()).add(connection);
    }

    public static void closeConnections() {
        for(Map.Entry element: connections.entrySet()) {
            ArrayList<DBConnection> conn = (ArrayList<DBConnection>) element.getValue();
            for(DBConnection c: conn) {
                c.close();
            }
            System.out.println("Connections to "+(String) element.getKey()+" closed.");
        }
    }
}
