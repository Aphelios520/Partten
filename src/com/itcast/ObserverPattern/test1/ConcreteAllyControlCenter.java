package com.itcast.ObserverPattern.test1;

public class ConcreteAllyControlCenter extends AllControlCenter {
	public ConcreteAllyControlCenter(String name) {
		this.allyName=name;
		System.out.println(name+"战队组建成功");
		System.out.println("------------------");
	}
	
	@Override
	public void notifyObserver(String name) {
		System.out.println(this.allyName+"战队紧急通知盟友"+name+"受到敌人攻击");
		for(Observer obs: players){
			if(!obs.getName().equalsIgnoreCase(name)){
				obs.help();
			}
		}
	}
}
