package main.java.behavioral.observer;

import main.java.behavioral.observer.TrafficLights.State;

public class Pedestrian implements Observer {

	@Override
	public void update(TrafficLights trafficLights) {

		if (trafficLights.getState().equals(State.RED)) {
			System.out.println(
				"Traffic lights is " + State.GREEN
					+ " for pedestrians -> Pedestrians CAN cross the street");
		} else {
			System.out.println(
				"Traffic lights is " + State.RED
					+ " for pedestrians -> Pedestrians CAN'T cross the street");
		}
	}
}
