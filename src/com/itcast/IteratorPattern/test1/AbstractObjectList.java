package com.itcast.IteratorPattern.test1;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObjectList {
	protected List<Object> objects = new ArrayList<>();
	
	public AbstractObjectList (List<Object> objects){
		this.objects=objects;
	}
	public void addObject(Object object){
		this.objects.add(object);
	}
	public void removeObject(Object object){
		this.objects.remove(object);
	}
	public List<Object> getObjects(){
		return this.objects;
	}
	public  abstract AbstractIterator createIterator();
}
