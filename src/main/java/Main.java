package main.java;

import main.java.creational.abstractfactory.AbstractFactory;
import main.java.creational.abstractfactory.CreditCard;
import main.java.creational.abstractfactory.FactoryProvider;
import main.java.creational.factorymethod.PaymentMethod;
import main.java.creational.factorymethod.PaymentMethodFactory;
import main.java.creational.factorymethod.PaymentMethodType;

public class Main {

	public static void main(String[] args) {

		testFactoryMethod();
		testAbstractFactory();
	}

	private static void testFactoryMethod() {

		PaymentMethod paymentMethod = PaymentMethodFactory
			.buildPaymentMethod(PaymentMethodType.PAYPAL);
		paymentMethod.makePayment();
	}

	private static void testAbstractFactory() {

		AbstractFactory creditCardFactory = FactoryProvider.getFactory("CREDITCARD");
		CreditCard creditCard = (CreditCard) creditCardFactory.create("VISA");

		AbstractFactory paymentMethodFactory = FactoryProvider.getFactory("PAYMENTMETHOD");
		main.java.creational.abstractfactory.PaymentMethod paymentMethod = (main.java.creational.abstractfactory.PaymentMethod) paymentMethodFactory
			.create("DEBIT");

		System.out.println(
			paymentMethod.makePayment() + " with brand " + creditCard.getType() + " and number "
				+ creditCard.getNumber());
	}
}
