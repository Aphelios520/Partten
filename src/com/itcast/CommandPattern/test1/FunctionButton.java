package com.itcast.CommandPattern.test1;

public class FunctionButton {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	public void click(){
		System.out.println("单机功能键：");
		command.execute();
	}
}
