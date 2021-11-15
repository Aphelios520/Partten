package com.itcast.DecoratorPattern.test1;

public class BlackBorlderDecorator extends ComponentDecorator {
	
	public BlackBorlderDecorator(Component component) {
		super(component);
	}
	public void display(){
		super.display();
		this.setBlackBorlder();
	}
	public void setBlackBorlder(){
		System.out.println("为构件增加黑色边框");
	}
	
}
