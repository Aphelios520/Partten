package com.itcast.ObserverPattern.test1;

import java.util.ArrayList;


public abstract class AllControlCenter {
	protected String allyName;
	protected ArrayList<Observer> players = new ArrayList<>();
	
	public void join(Observer observer){
		System.out.println(observer.getName()+"加入"+this.allyName+"战队！");
		players.add(observer);
	}
	public void quit(Observer observer){
		System.out.println(observer.getName()+"退出"+this.allyName+"战队！");
	}
	public abstract void notifyObserver(String name);
}
