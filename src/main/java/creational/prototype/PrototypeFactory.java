package main.java.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

	public static final String VISA = "VISA";
	public static final String AMEX = "AMEX";

	public static Map<String, PrototypeCard> prototypes = new HashMap<>();

	public static PrototypeCard getInstance(String type) throws CloneNotSupportedException {
		return prototypes.get(type).clone();
	}

	public static void loadCards() {
		Visa visa = new Visa();
		visa.setName("VISA");
		prototypes.put(VISA, visa);

		Amex amex = new Amex();
		amex.setName("AMEX");
		prototypes.put(AMEX, amex);
	}
}
