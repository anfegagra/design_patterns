package main.java.behavioral.templatemethod;

public abstract class Payment {

	abstract void start();

	abstract void end();

	public final void makePayment() {
		start();
		end();
	}
}
