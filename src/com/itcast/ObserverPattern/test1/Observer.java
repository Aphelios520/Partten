package com.itcast.ObserverPattern.test1;

public interface Observer {
	public String getName();
	public void setName(String name);
	public void help();
	public void beAttacked(AllControlCenter acc);
}
