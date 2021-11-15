package com.itcast.ObserverPattern.test2;

public class ConcreteController extends ControlAnstract {
	public ConcreteController(String name) {
		this.ttName = name;
	}
	
	@Override
	public void notfily(String name) {
		System.out.println(this.ttName+"股票涨了 涨了%5");
		for(Obsercer obsercer: invsstors){
			if(!obsercer.getName().equalsIgnoreCase(name)){
				obsercer.message();
			}
		}
	}
}
