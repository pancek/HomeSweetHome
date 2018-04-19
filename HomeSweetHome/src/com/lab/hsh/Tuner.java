package com.lab.hsh;

public class Tuner implements Device {
	
	private boolean isOn = false;
	
	@Override
	public void on() {
		isOn = true;
		System.out.println("Cdplayer is on.");
	}

	@Override
	public void off() {
		isOn = false;
		System.out.println("Cdplayer is off.");
	}
	
	public void setAM() {
		System.out.println("AM set");
	}
	
	public void setFM() {
		System.out.println("FM set");
	}
	
	public void setFrequency() {
		System.out.println("Frequency set");
	}

}
