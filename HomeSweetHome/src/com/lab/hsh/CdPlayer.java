package com.lab.hsh;

public class CdPlayer implements Device {

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

	public void eject() {
		System.out.println("Ejected.");
	}

	public void play(String cd) {
		System.out.println("Is playnig: " + cd);
	}
	
	public void stop() {
		System.out.println("Stopped.");
	}
	
	public void pause() {
		System.out.println("Paused.");
	}

}
