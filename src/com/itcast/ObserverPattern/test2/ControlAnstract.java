package com.itcast.ObserverPattern.test2;

import java.util.ArrayList;

public abstract class ControlAnstract {
	protected  String  ttName;
	protected ArrayList<Obsercer> invsstors = new ArrayList<>();
	
	public void buyIn(Obsercer obsercer){
		System.out.println(obsercer.getName()+"买入了"+this.ttName+"股票");
		invsstors.add(obsercer);
	}
	public void saleOut(Obsercer obsercer){
		System.out.println(obsercer.getName()+"卖出了"+this.ttName+"股票");
		invsstors.remove(obsercer);
	}
	public abstract void notfily(String name);
}
