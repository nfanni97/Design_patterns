package observer;

import java.util.LinkedList;

public class Subject {
	protected int m_value;
	protected LinkedList<Observer> observers = new LinkedList<>();
	public Subject()
	{
		observers.add(new DivObserver(4));
		observers.add(new ModObserver(3));
		observers.add(new ProdObserver(2));
	}
	public void set_value(int value)
	{
		m_value = value;
		notifyObservers();
	}
	public void notifyObservers()
	{
		for(Observer o: observers) {
			o.update(m_value);
		}
	}

	public static void main(String[] args) {
		Subject subj = new Subject();
		subj.set_value(14);
	}

}
