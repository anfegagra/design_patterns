package main.java.behavioral.observer;

public class TrafficLights {

	private Status status;

	public TrafficLights(Status status) {
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public enum Status {

		RED,
		GREEN;
	}
}
