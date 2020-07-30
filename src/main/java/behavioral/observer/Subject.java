package main.java.behavioral.observer;

public interface Subject {

	void attach(Observer observer);

	void detach(Observer observer);

	void notifyUpdate(TrafficLights trafficLights);

}
