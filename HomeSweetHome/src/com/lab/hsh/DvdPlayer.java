package com.lab.hsh;

public class DvdPlayer implements Device {

	private boolean isOn = false;
	
	@Override
	public void on() {
		isOn = true;
		System.out.println("DvdPlayer is on");
		
	}

	@Override
	public void off() {
		isOn = true;
		System.out.println("DvdPlayer is off");
		
	}
	
	public void eject() {
		System.out.println("Disc ejected succesfully");
	}
	
	public void stop() {
		System.out.println("Stopped");
	}

}
