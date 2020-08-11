package main.java.behavioral.state;

public class Silent implements MobileAlertState {

	@Override
	public void alert(MobileAlertStateContext mobileAlertStateContext) {
		System.out.println("Silent...");
	}
}
