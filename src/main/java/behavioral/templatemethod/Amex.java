package main.java.behavioral.templatemethod;

public class Amex extends Payment {

	@Override
	void start() {
		System.out.println("Starting the payment with AMEX...");
	}

	@Override
	void end() {
		System.out.println("Ending the payment with AMEX...");
	}
}
