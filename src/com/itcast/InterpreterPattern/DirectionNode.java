package com.itcast.InterpreterPattern;

public class DirectionNode extends AbstractNode {
	private String name;
	public DirectionNode(String name){
		this.name = name;
	}
	@Override
	public String interpret() {
		if(name.equalsIgnoreCase("up")){
			return "向上";
		}else if(name.equalsIgnoreCase("down")){
			return "向下";
		}else if(name.equalsIgnoreCase("left")){
			return "向左";
		}else if(name.equalsIgnoreCase("right")){
			return "向右";
		}else {
			return "无效命令";
		}
	}
}
