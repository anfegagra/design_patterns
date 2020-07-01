package main.java.creational.prototype;

public interface PrototypeCard extends Cloneable {

	void getType();

	PrototypeCard clone() throws CloneNotSupportedException;

}
