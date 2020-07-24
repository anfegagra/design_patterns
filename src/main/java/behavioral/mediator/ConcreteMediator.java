package main.java.behavioral.mediator;

public class ConcreteMediator implements Mediator {

	private ConcreteColleague1 user1;
	private ConcreteColleague2 user2;

	public void setUser1(ConcreteColleague1 user1) {
		this.user1 = user1;
	}

	public void setUser2(ConcreteColleague2 user2) {
		this.user2 = user2;
	}

	@Override
	public void send(String message, Colleague colleague) {
		if (colleague == user1) {
			user2.receiveMessage(message);
		} else if (colleague == user2) {
			user1.receiveMessage(message);
		}
	}
}
