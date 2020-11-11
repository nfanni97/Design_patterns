package nullObject;

import java.util.HashMap;

public class PhoneBook {

	private HashMap<String,People> records;
	public PhoneBook() {
		records = new HashMap<String,People> ();
	}
	public Entry search(String name) {
		Entry p = records.get(name);
		if (p == null) return new Noone();
		else return p;
	}
	public void add(People p) {
		records.put(p.getName(), p);
	}
}
