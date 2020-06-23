package main.java;

import main.java.creational.factorymethod.PaymentMethod;
import main.java.creational.factorymethod.PaymentMethodFactory;
import main.java.creational.factorymethod.PaymentMethodType;

public class Main {

	public static void main(String[] args) {
		testFactoryMethod();
	}

	private static void testFactoryMethod() {
		PaymentMethod paymentMethod = PaymentMethodFactory
			.buildPaymentMethod(PaymentMethodType.PAYPAL);
		paymentMethod.makePayment();
	}
}
