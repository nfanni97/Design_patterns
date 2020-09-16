package observer;

public class DivObserver implements Observer {
	protected int m_div;

	public DivObserver(int div) {
		m_div = div;
	}

	@Override
	public void update(int val) {
		System.out.println(val + " div " + m_div + " is " + val / m_div + '\n');
	}

}
