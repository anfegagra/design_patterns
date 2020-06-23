package main.java;

import main.java.creational.factorymethod.PaymentMethod;
import main.java.creational.factorymethod.PaymentMethodFactory;
import main.java.creational.factorymethod.PaymentMethodType;

public class Main {

	public static void main(String[] args) {
		makePayment();
	}

	private static void makePayment() {
		PaymentMethod paymentMethod = PaymentMethodFactory
			.buildPaymentMethod(PaymentMethodType.PAYPAL);
		paymentMethod.makePayment();
	}
}
