package main.java.behavioral.command;

public class CreditCard {

	public void sendPinToCustomer() {
		System.out.println("Sending pin in order to activate the credit card...");
	}

	public void activate() {
		System.out.println("The credit card is being activated...");
	}

	public void sendSmsToCustomerCardActivated() {
		System.out.println("The credit card was activated successfully!");
	}

	public void deactivate() {
		System.out.println("The credit card is being deactivated...");
	}

	public void sendPinToCustomerCardDeactivated() {
		System.out.println("The credit card was deactivated successfully!");
	}

}
