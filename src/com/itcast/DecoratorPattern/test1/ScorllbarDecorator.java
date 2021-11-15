package com.itcast.DecoratorPattern.test1;

public class ScorllbarDecorator extends ComponentDecorator {
	
	public ScorllbarDecorator(Component component) {
		super(component);
	}
	public void display(){
		super.display();
		this.setScorllBar();
	}
	public void setScorllBar(){
		System.out.println("增加滚动条");
	}
}
