package com.itcast.CommandPattern.test1;

public class ExitCommand extends Command{
	private SystemExitClass exitClass;
	
	public ExitCommand() {
		exitClass = new SystemExitClass();
	}
	@Override
	public void execute() {
		exitClass.exit();
	}
}
