package com.itcast.BridgePattern.Text2;

public abstract class Image {
	protected Database database ;
	
	public Image(){
	
	}
	public void setDatabase(Database database){
		this.database=database;
	}
	public abstract void famort(String fileName);
}
