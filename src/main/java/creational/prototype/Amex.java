package main.java.creational.prototype;

public class Amex implements PrototypeCard {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void getType() {
		System.out.println("This is an AMEX card");
	}

	@Override
	public PrototypeCard clone() throws CloneNotSupportedException {
		System.out.println("Cloning AMEX card...");
		return (Amex) super.clone();
	}
}
