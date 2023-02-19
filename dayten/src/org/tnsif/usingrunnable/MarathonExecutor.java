package org.tnsif.usingrunnable;
//Driver class
//program to demonstrate on runnable interface a thread

public class MarathonExecutor {

	public static void main(String[] args) {
		Marathon m=new Marathon();
		m.setCity("Nashik");
		m.setSpeed(100);
		m.run();

	}

}
