package main.java.behavioral.mediator;

public abstract class Colleague {

	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void sendMessage(String message);

	public abstract void receiveMessage(String message);
}
