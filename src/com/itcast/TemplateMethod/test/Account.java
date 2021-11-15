package com.itcast.TemplateMethod.test;

public abstract class Account {
	public boolean validate(String account,String password){
		System.out.println("账号是："+account);
		System.out.println("密码是："+password);
		if(account.equalsIgnoreCase("李杰") && password.equalsIgnoreCase("123456")) {
			return true;
		}else {
			return false;
		}
	}
	public abstract void calculateInterest();
	public void display(){
		System.out.println("显示利息");
	}
	
	public void handle(String account ,String password){
		if(!validate(account,password)){
			System.out.println("账号或者密码错误");
			return;
		}else {
			calculateInterest();
			display();
		}
	}
}
