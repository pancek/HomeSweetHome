package com.lab.hsh;

import java.util.ArrayList;
import java.util.List;

public class Facade implements Device {
	Tuner t;
	CdPlayer cd;
	DvdPlayer dvd;
	Projector p;
	Amplifier a;
	Lights l;
	List<Device> ldev;
	
	
	public Facade() {
		t = new Tuner();
		cd = new CdPlayer();
		dvd = new DvdPlayer();
		p = new Projector();
		a = new Amplifier();
		l = new Lights();
		ldev = new ArrayList<Device>();
		ldev.add(t);
		ldev.add(cd);
		ldev.add(dvd);
		ldev.add(p);
		ldev.add(a);
		ldev.add(l);
	}
	
	@Override
	public void on() {
		for (Device d: ldev) {
			d.on();
		}
		
	}

	@Override
	public void off() {
		
		for (Device d: ldev) {
			d.off();
		}
		
	}
}
