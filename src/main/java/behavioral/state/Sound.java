package main.java.behavioral.state;

public class Sound implements MobileAlertState{

	@Override
	public void alert(MobileAlertStateContext mobileAlertStateContext) {
		System.out.println("Ringing... Ringing...");
	}
}
