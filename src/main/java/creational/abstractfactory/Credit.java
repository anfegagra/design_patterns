package main.java.creational.abstractfactory;

public class Credit implements PaymentMethod {

	@Override
	public String makePayment() {
		return "Payment made with credit";
	}
}
