package com.itcast.CommandPattern.test1;

import java.time.Period;

public class Invoker {
	private CommandQueue queue ;
	
	public Invoker(CommandQueue queue) {
		this.queue = queue;
	}
	
	public void call(){
		queue.execute();
	}
}
