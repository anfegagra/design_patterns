package main.java.creational.prototype;

public class Visa implements PrototypeCard {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void getType() {
		System.out.println("This is a VISA card");
	}

	@Override
	public PrototypeCard clone() throws CloneNotSupportedException {
		System.out.println("Cloning a VISA card");
		return (Visa) super.clone();
	}
}
