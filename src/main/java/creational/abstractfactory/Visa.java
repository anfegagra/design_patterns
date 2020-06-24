package main.java.creational.abstractfactory;

public class Visa implements CreditCard {

	@Override
	public String getType() {
		return "VISA";
	}

	@Override
	public String getNumber() {
		return "0000 0000 0000 VISA";
	}
}
