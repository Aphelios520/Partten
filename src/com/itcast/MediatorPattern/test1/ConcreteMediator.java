package com.itcast.MediatorPattern.test1;

public class ConcreteMediator extends Mediator {
	public Button button;
	public List list;
	public ComboBox comboBox;
	public TextBox textBox;
	@Override
	public void componentChanged(Component c) {
		if(c==button){
			System.out.println("单机增加按钮");
			list.update();
			comboBox.update();
			textBox.update();
		}else if(c==list){
			System.out.println("从列表中选中用户");
			list.select();
			textBox.setText();
		}else if(c==comboBox){
			System.out.println("从组合框中选中客户");
			comboBox.select();
			textBox.setText();
		}
	}
}
