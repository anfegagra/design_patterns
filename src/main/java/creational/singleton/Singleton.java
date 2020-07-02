package main.java.creational.singleton;

public class Singleton {

	private static Singleton instance;

	private String value;

	private Singleton() {

	}

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			return new Singleton();
		}
		return instance;
	}

	public static void setInstance(Singleton instance) {
		Singleton.instance = instance;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
