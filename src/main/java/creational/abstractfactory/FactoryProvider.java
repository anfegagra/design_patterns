package main.java.creational.abstractfactory;

public class FactoryProvider {

	public static AbstractFactory getFactory(String factory) {
		if ("CREDITCARD".equals(factory)) {
			return new CreditCardFactory();
		} else if ("PAYMENTMETHOD".equals(factory)) {
			return new PaymentMethodFactory();
		}
		return null;
	}
}
