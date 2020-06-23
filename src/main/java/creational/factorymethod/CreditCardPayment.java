package main.java.creational.factorymethod;

public class CreditCardPayment implements PaymentMethod{

	@Override
	public void makePayment() {
		System.out.println("Making the payment with credit card");
	}
}
