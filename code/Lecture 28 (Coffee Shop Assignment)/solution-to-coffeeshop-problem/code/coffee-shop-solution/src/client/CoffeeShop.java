package client;

import coffeeshop.CoffeeAttendent;
import customers.Customer;
import customers.WaitingCustomer;

public class CoffeeShop {

	public static void main(String args[]) {

		Customer robert = new Customer("joe", "green gola");
		Customer bill = new Customer("sandra", "meetha pan");

		CoffeeAttendent coffeeAttendent = new CoffeeAttendent();
		coffeeAttendent.takeOrder(robert);
		coffeeAttendent.takeOrder(bill);

		coffeeAttendent.prepareDrink("green gola");
		coffeeAttendent.prepareDrink("meetha pan");

		coffeeAttendent.callOutCompletedOrders();
	}
}
