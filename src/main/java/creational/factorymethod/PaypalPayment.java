package main.java.creational.factorymethod;

public class PaypalPayment implements PaymentMethod {

	@Override
	public void makePayment() {
		System.out.println("Making the payment with Paypal");
	}
}
