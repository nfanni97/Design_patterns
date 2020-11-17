package chainofresponsibility;

import java.util.Random;

public class ChainDemo {
    public static void main(String[] args) {
        Handler[] nodes = new Handler[4];
        nodes[0] = new Handler(null);
        for (int i = 1; i < nodes.length; i++) {
            nodes[i] = new Handler(nodes[i - 1]);
        }
        Random r = new Random();
        for (int i = 1; i < 10; i++) {
            int firstHandler = r.nextInt(nodes.length);
            nodes[firstHandler].handle(i);
        }
    }
}
