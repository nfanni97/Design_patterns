package observer;

public class ModObserver implements Observer {
	protected int m_mod;

	public ModObserver(int mod) {
		m_mod = mod;
	}

	@Override
	public void update(int val) {
		System.out.println(val + " mod " + m_mod + " is " + val % m_mod + '\n');
	}
}
