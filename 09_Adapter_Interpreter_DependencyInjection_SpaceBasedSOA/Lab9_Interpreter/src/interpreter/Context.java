package interpreter;
import java.util.HashMap;

public class Context {
	private HashMap<String, Boolean> _map = new HashMap<String, Boolean>();
	
	public boolean lookup(String s) {
		if (_map.containsKey(s)) {
			return _map.get(s);
		} else {
			return false;
		}
	};
	public void assign(String name, boolean b) {
		if (!_map.containsKey(name)) {
			_map.put(name, b);
		} else {
			_map.replace(name, b);
		}
	};
};