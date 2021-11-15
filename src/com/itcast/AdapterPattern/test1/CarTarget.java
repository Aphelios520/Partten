package com.itcast.AdapterPattern.test1;

public abstract class CarTarget {
	public void move(){
		System.out.println("玩具车移动");
	}
	
	public abstract void phonate();
	public abstract void twinkle();
}
