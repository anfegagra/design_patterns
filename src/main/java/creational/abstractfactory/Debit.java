package main.java.creational.abstractfactory;

public class Debit implements PaymentMethod {

	@Override
	public String makePayment() {
		return "Payment made with debit";
	}
}
