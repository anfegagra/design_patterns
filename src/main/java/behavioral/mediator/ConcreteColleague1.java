package main.java.behavioral.mediator;

public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void sendMessage(String message) {
		mediator.send(message, this);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println("Colleague1 has received the following message: " + message);
	}
}
