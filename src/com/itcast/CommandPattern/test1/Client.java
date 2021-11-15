package com.itcast.CommandPattern.test1;

import com.itcast.CommandPattern.XMLUtil.XMLUtil;

public class Client {
	public static void main(String[] args) {
		Command help =(Command) XMLUtil.getBean(0);
		FunctionButton button =new FunctionButton();
		button.setCommand(help);
		button.click();
		System.out.println("=================");
		Command display =(Command)XMLUtil.getBean(1);
		FunctionButton button1 =new FunctionButton();
		button1.setCommand(display);
		button1.click();
		//单机功能键：
		//显示帮助文档
		//=================
		//单机功能键：
		//退出系统
		CommandQueue queue =new CommandQueue();
		queue.addCommand(help);
		queue.addCommand(display);
		Invoker invoker =new Invoker(queue);
		invoker.call();
	}
}
