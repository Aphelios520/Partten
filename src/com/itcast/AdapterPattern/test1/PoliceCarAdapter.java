package com.itcast.AdapterPattern.test1;

public class PoliceCarAdapter extends CarTarget {
	private PoliceLamp policeLamp;
	private PoliceSound policeSound;
	public PoliceCarAdapter(){
		policeLamp =new PoliceLamp();
		policeSound =new PoliceSound();
	}
	@Override
	public void phonate() {
		policeSound.alarmSound();
	}
	
	@Override
	public void twinkle() {
		policeLamp.alaemLamp();
	}
}
