package main.java.creational.abstractfactory;

public class Mastercard implements CreditCard {

	@Override
	public String getType() {
		return "MASTERCARD";
	}

	@Override
	public String getNumber() {
		return "0000 0000 MAST CARD";
	}
}
