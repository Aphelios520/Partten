package com.itcast.PrototypePattern.test1.deepClone;

import java.io.Serializable;

public class Attachment implements Serializable {
	private String name;
	
	public Attachment() {
	}
	
	public Attachment(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
