package nullObject;

import java.util.HashMap;

public class PhoneBook {
	private HashMap<String, People> records;

	public PhoneBook() {
		records = new HashMap<String, People>();
	}

	public AbstractPeople search(String name) {
		if (records.containsKey(name)) {
			return records.get(name);
		} else {
			return new NullPeople();
		}
	}

	public void add(People p) {
		records.put(p.getName(), p);
	}
}
