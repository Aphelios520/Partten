package com.itcast.ObserverPattern.test2;

public class Invsstor implements  Obsercer {
	private String name;
	public Invsstor (String name){
		this.name=name;
	}
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public void setName(String name) {
		this.name=name;
	}
	
	@Override
	public void message() {
		System.out.println(this.name+"收到了涨价通知");
	}
	
	@Override
	public void risePice(ControlAnstract anstract) {
		System.out.println(this.name+"知道涨价");
		anstract.notfily(name);
	}
}
