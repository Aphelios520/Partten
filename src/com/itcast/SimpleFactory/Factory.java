package com.itcast.SimpleFactory;

public class Factory {
	public static Product getProduct(String language){
		Product  product=null ;
		if(language.equals("English")){
			return product =new ConcreteProduct();
		}else if(language.equals("Japanese")){
			return product = new ConcreteProduct2();
		}
		return product;
	}
}
