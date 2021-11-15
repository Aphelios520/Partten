package com.itcast.AbstractFactory.Test1.modle;

public class SpringTextField implements  TextField {
	@Override
	public void display() {
		System.out.println("显示绿色的文本框");
	}
}
