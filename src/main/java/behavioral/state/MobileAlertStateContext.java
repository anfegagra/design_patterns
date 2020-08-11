package main.java.behavioral.state;

public class MobileAlertStateContext {

	private MobileAlertState mobileAlertState;

	public MobileAlertStateContext() {
		this.mobileAlertState = new Sound();
	}

	public void setState(MobileAlertState mobileAlertState) {
		this.mobileAlertState = mobileAlertState;
	}

	public void alert() {
		mobileAlertState.alert(this);
	}
}
