package chainofresponsibility;

public class Handler {
    private static java.util.Random s_rn = new java.util.Random();
    private static int s_next = 1;
    private int m_id = s_next++;
    private Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public void handle(int num) {
        if (s_rn.nextInt(4) != 0) {
            System.out.print(m_id + "-busy  ");
            if (successor != null) {
                successor.handle(num);
            } else {
                System.out.println(num + " fallen off the chain at " + m_id);
            }
        } else {
            System.out.println(m_id + "-handled-" + num);
        }
    }
}
