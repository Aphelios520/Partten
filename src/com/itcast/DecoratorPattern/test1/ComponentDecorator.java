package com.itcast.DecoratorPattern.test1;

public class ComponentDecorator extends Component {
	private Component component;
	public ComponentDecorator (Component component){
		this.component=component;
	}
	@Override
	public void display() {
		component.display();
	}
}
