package org.tnsif.encapsulationdemo;

public class HDFC {
	private int pin;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	void accept()
	{
		System.out.println("ATM pin is : "+pin);
	}

}
