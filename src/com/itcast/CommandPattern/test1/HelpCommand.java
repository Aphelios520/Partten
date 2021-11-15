package com.itcast.CommandPattern.test1;

public class HelpCommand extends Command {
	private DisplayHelpClass helpClass;
	public HelpCommand() {
		helpClass = new DisplayHelpClass();
	}
	@Override
	public void execute() {
		helpClass.display();
	}
}
