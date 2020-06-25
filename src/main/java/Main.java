package main.java;

import main.java.creational.abstractfactory.AbstractFactory;
import main.java.creational.abstractfactory.CreditCard;
import main.java.creational.abstractfactory.FactoryProvider;
import main.java.creational.builder.Card;
import main.java.creational.factorymethod.PaymentMethod;
import main.java.creational.factorymethod.PaymentMethodFactory;
import main.java.creational.factorymethod.PaymentMethodType;

public class Main {

	public static void main(String[] args) {

		testFactoryMethod();
		testAbstractFactory();
		testBuilder();
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

	private static void testBuilder() {
		Card card = new Card.CardBuilder("VISA", "0000 1111 2222 3333")
			.name("Pipe")
			.expirationDate(2050)
			.isCredit(true)
			.build();

		System.out.println(card);

		Card card2 = new Card.CardBuilder("AMEX", "9999 9999 9999 9999").build();

		System.out.println(card2);
	}
}
