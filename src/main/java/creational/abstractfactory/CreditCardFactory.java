package main.java.creational.abstractfactory;

public class CreditCardFactory implements AbstractFactory<CreditCard> {

	@Override
	public CreditCard create(String type) {
		if ("VISA".equals(type)) {
			return new Visa();
		} else if ("MASTERCARD".equals(type)) {
			return new Mastercard();
		}
		return null;
	}
}
