package com.itcast.StatePattern.test2;

public class OnState extends SwitchState {
	@Override
	public void on(Switch s) {
		System.out.println("开关已经打开");
	}
	
	@Override
	public void off(Switch s) {
		System.out.println("关闭");
		s.setState(Switch.getState("off"));
	}
	
}
