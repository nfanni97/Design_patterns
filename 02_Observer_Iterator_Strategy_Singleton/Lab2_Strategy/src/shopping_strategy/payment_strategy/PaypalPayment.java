package shopping_strategy.payment_strategy;

public class PaypalPayment implements PaymentStrategy {
    private String user;
    private String pwd;

    public PaypalPayment(String u, String p) {
        user = u;
        pwd = p;
    }

    @Override
    public void pay(int amount) {
        System.out.println(user + " payed " + amount + " with paypal");
    }
}
