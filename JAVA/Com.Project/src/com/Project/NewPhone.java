package com.Project;
//Multiple Inhertiance

public class NewPhone implements FeaturePhone, SmartPhone {

	int number;
	String message;

	@Override
	public void videoCall() {

		System.out.println(" video Calling " + number);
	}

	@Override
	public void voiceMesage() {
		System.out.println("Voice Message :" + " " + message);

	}

	@Override
	public void call(int number) {
		this.number = number;
		System.out.println("Calling Number:" + " " + number);

	}

	@Override
	public void message(String mgs) {
		this.message = mgs;

		System.out.println("Sending Message:" + " " + mgs);

	}

	public static void main(String[] args) {

		NewPhone np1 = new NewPhone();
		np1.call(911);
		np1.message("Emergency");
		np1.videoCall();
		np1.voiceMesage();
	}
}