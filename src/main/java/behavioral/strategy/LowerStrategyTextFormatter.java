package main.java.behavioral.strategy;

public class LowerStrategyTextFormatter implements StrategyTextFormatter {

	@Override
	public void format(String text) {
		System.out.println("This text will be converted to lower case: " + text.toLowerCase());
	}
}
