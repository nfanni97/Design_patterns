package shopping_strategy;

import shopping_strategy.payment_strategy.CardPayment;
import shopping_strategy.payment_strategy.PaypalPayment;

public class ShoppingCartTest {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("1234", 10);
		Item item2 = new Item("5678", 40);

		cart.addItem(item1);
		cart.addItem(item2);

		cart.pay(new CardPayment("Kiss Pista", "1234567890123456", "786", "12/16"));
		cart.pay(new PaypalPayment("myemail@example.com", "mypwd"));
	}
}
