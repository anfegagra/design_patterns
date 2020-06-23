package main.java.creational.factorymethod;

public class PaymentMethodFactory {

	public static PaymentMethod buildPaymentMethod(PaymentMethodType paymentMethodType) {
		switch (paymentMethodType) {
			case PAYPAL:
				return new PaypalPayment();
			case CREDIT_CARD:
				return new CreditCardPayment();
			default:
				return new CreditCardPayment();
		}
	}
}
