package com.itcast.FlyweightPattern.test1;

import java.util.HashMap;
import java.util.Hashtable;

public class IgoChessFactory {
	private static IgoChessFactory instance = new IgoChessFactory();
	private static Hashtable hashtable;
	
	private IgoChessFactory(){
		hashtable = new Hashtable();
		IgoChessman black = new BlackIgoChessman();
		hashtable.put("b",black);
		IgoChessman write = new WriteIgoChessman();
		hashtable.put("w",write);
	}
	
	public static IgoChessFactory getInstance(){
		return instance;
	}
	public static IgoChessman getIgoChessman(String color){
		return (IgoChessman) hashtable.get(color);
	}
}
