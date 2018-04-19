package com.lab.hsh;

public class Amplifier implements Device {

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
	
	public void setStereoSound() {
		System.out.println("Stereo sound set.");
	}
	
	public void setVolume(int level) {
		System.out.println("Volume set at: "+level);
	}
	
	public void setTuner(Tuner t) {
		System.out.println("Tuner set.");
	}
	
	public void setDVD(DvdPlayer dvd) {
		System.out.println("DVD set.");
	}
	
	public void setCD(CdPlayer cd) {
		System.out.println("CD set.");
	}
	
}
