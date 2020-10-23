package main.java.behavioral.strategy;

public class CapitalStrategyTextFormatter implements StrategyTextFormatter {

	@Override
	public void format(String text) {
		System.out.println("This text will be converted to upper case: " + text.toUpperCase());
	}
}
