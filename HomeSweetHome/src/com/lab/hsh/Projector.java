package com.lab.hsh;

public class Projector implements Device {

	private boolean isOn = false;
	@Override
	public void on() {
		// TODO Auto-generated method stub
		isOn = true;
		System.out.println("Projector is on");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		isOn = true;
		System.out.println("Projector is off");
	}
	
	private void wideScreenMode() {
		// TODO Auto-generated method stub
		System.out.println("WideScreen");
	}
	private void tvMode() {
		// TODO Auto-generated method stub
		System.out.println("tvMode");
	}
}
