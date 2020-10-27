package main.java.behavioral.templatemethod;

public class Visa extends Payment{

	@Override
	void start() {
		System.out.println("Starting the payment with VISA...");
	}

	@Override
	void end() {
		System.out.println("Ending the payment with VISA...");
	}
}
