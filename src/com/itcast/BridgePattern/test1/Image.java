package com.itcast.BridgePattern.test1;

public abstract class Image {
	protected   ImgeImpl imge;
	
	public void setImge(ImgeImpl imge){
		this.imge =imge;
	}
	public abstract  void parseFile(String fileName);
	
}
