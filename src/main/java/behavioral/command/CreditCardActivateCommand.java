package main.java.behavioral.command;

public class CreditCardActivateCommand implements Command {

	private CreditCard creditCard;

	public CreditCardActivateCommand(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public void execute() {
		creditCard.sendPinToCustomer();
		creditCard.activate();
		creditCard.sendSmsToCustomerCardActivated();
	}
}
