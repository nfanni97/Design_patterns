package shopping_strategy.payment_strategy;

public class CardPayment implements PaymentStrategy {
    // note: as number and ccv could start with zeroes (and number is very big),
    // they are stored as Strings
    // note: expiry is also stored as String for the sake of simplicity
    private String name;
    private String number;
    private String ccv;
    private String expiry;

    public CardPayment(String na, String num, String ccv, String exp) {
        name = na;
        number = num;
        this.ccv = ccv;
        expiry = exp;
    }

    @Override
    public void pay(int amount) {
        System.out.println(name + " payed " + amount + " with card");
    }
}
