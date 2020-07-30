package main.java.behavioral.observer;

import main.java.behavioral.observer.TrafficLights.Status;

public class Pedestrian implements Observer {

	@Override
	public void update(TrafficLights trafficLights) {

		if (trafficLights.getStatus().equals(Status.RED)) {
			System.out.println(
				"Traffic lights is " + Status.GREEN
					+ " for pedestrians -> Pedestrians CAN cross the street");
		} else {
			System.out.println(
				"Traffic lights is " + Status.RED
					+ " for pedestrians -> Pedestrians CAN'T cross the street");
		}
	}
}
