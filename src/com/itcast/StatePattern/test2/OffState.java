package com.itcast.StatePattern.test2;

public class OffState extends SwitchState {
	@Override
	public void on(Switch s) {
		System.out.println("打开");
		s.setState(Switch.getState("on"));
	}
	
	@Override
	public void off(Switch s) {
		System.out.println("已经关闭");
	}
}
