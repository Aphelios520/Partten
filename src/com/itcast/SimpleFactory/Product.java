package com.itcast.SimpleFactory;

public abstract class Product {
	public void say(){
		System.out.println("宝贝，你好漂亮");
	}
	
	public abstract  void language();
}
