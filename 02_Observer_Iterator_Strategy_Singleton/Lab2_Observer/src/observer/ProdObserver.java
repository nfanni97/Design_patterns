package observer;

public class ProdObserver implements Observer {
    protected int m_prod;

    public ProdObserver(int prod) {
        m_prod = prod;
    }

    @Override
    public void update(int val) {
        System.out.println(val + " * " + m_prod + " is " + val * m_prod + '\n');
    }
}
