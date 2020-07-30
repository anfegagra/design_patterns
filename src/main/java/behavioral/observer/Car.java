package main.java.behavioral.observer;

import main.java.behavioral.observer.TrafficLights.State;

public class Car implements Observer {

	@Override
	public void update(TrafficLights trafficLights) {

		if (trafficLights.getState().equals(State.RED)) {
			System.out.println(
				"Traffic lights is " + State.RED
					+ " for cars -> Cars CAN'T go forward");
		} else {
			System.out.println(
				"Traffic lights is " + State.GREEN
					+ " for cars -> Cars CAN go forward");
		}
	}
}
