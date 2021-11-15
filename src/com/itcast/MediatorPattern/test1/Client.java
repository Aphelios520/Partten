package com.itcast.MediatorPattern.test1;

public class Client {
	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		
		Button button =new Button();
		List list =new List();
		ComboBox comboBox =new ComboBox();
		TextBox textBox = new TextBox();
		
		button.setMediator(mediator);
		list.setMediator(mediator);
		textBox.setMediator(mediator);
		comboBox.setMediator(mediator);
		
		mediator.button=button;
		mediator.list=list;
		mediator.comboBox=comboBox;
		mediator.textBox=textBox;
		
		button.changed();
		System.out.println("==================");
		list.changed();
	}
	//单机增加按钮
	//列表框增加一项：张无忌
	//组合框增加一项：张无忌
	//客户端信息增加成功后文本框清空
	//==================
	//从列表中选中用户
	//列表框中选中项：小龙女
	//文本框提示：小龙女
}
