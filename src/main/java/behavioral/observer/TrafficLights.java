package main.java.behavioral.observer;

public class TrafficLights {

	private State state;

	public TrafficLights(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public enum State {

		RED,
		GREEN;
	}
}
