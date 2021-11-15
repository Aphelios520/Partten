package com.itcast.InterpreterPattern;

public class Sentence extends AbstractNode {
	private AbstractNode direction;
	private AbstractNode action;
	private AbstractNode distance;
	public Sentence(AbstractNode direction,AbstractNode action, AbstractNode distance){
		this.direction =direction;
		this.action = action;
		this.distance = distance;
	}
	@Override
	public String interpret() {
		return direction.interpret()+action.interpret()+distance.interpret();
	}
}
