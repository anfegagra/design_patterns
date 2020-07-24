package main.java.behavioral.mediator;

public class ConcreteColleague2 extends Colleague{

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void sendMessage(String message) {
		mediator.send(message, this);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println("Colleague2 has received the following message: " + message);
	}
}
