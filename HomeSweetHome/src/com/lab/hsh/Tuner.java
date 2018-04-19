package com.lab.hsh;

public class Tuner implements Device {
	private void setAm() {
		// TODO Auto-generated method stub
		System.out.println("AM freq defined");
	}

	private void setFm() {
		// TODO Auto-generated method stub
		System.out.println("FM freq defined");
	}
	
	private void setFrequency() {
		// TODO Auto-generated method stub
		System.out.println("Set desired frequency - am/fm mode");
	}

	public void on() {
		System.out.println("Tuner is on");
		
	}

	@Override
	public void off() {
		System.out.println("Tuner is on");
		
	}
}
