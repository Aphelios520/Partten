package com.itcast.AbstractFactory.Test1.modle;

public class SpringButton implements Button {
	@Override
	public void display() {
		System.out.println("显示绿色的按钮");
	}
}
