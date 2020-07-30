package main.java.behavioral.observer;

import main.java.behavioral.observer.TrafficLights.Status;

public class Car implements Observer {

	@Override
	public void update(TrafficLights trafficLights) {

		if (trafficLights.getStatus().equals(Status.RED)) {
			System.out.println(
				"Traffic lights is " + Status.RED
					+ " for cars -> Cars CAN'T go forward");
		} else {
			System.out.println(
				"Traffic lights is " + Status.GREEN
					+ " for cars -> Cars CAN go forward");
		}
	}
}
