package com.itcast.DecoratorPattern.test1;

public class DecoratorTest {
	public static void main(String[] args) {
		Component component = new ListBox();
		ComponentDecorator decorator = new ScorllbarDecorator(component);
		//decorator.display();
		ComponentDecorator decorator1 = new BlackBorlderDecorator(decorator);
		decorator1.display();
	}
}
