package com.itcast.CommandPattern.test1;

import java.util.ArrayList;

public class CommandQueue {
	private ArrayList<Command> list = new ArrayList<>();
	
	public void addCommand(Command command){
		list.add(command);
	}
	public void removeCommand(Command command){
		list.remove(command);
	}
	public void execute(){
		for(Command command: list){
			command.execute();
		}
	}
}
