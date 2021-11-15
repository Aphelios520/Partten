package com.itcast.FlyweightPattern.test2;

public class Client {
	public static void main(String[] args) {
		IgoChessFactory factory = IgoChessFactory.getInstance();
		IgoChessman b1 = IgoChessFactory.getIgoChessman("b");
		IgoChessman b2 = IgoChessFactory.getIgoChessman("b");
		IgoChessman b3 = IgoChessFactory.getIgoChessman("b");
		System.out.println("黑子是否相同："+(b1==b2));
		System.out.println("黑子是否相同："+(b2==b3));
		IgoChessman w1 = IgoChessFactory.getIgoChessman("w");
		IgoChessman w2 = IgoChessFactory.getIgoChessman("w");
		System.out.println("黑子是否相同："+(w1==w2));
		
		b1.display(new Coordinates(1,3));
		b2.display(new Coordinates(2,4));
		b3.display(new Coordinates(5,3));
		w1.display(new Coordinates(8,6));
		w2.display(new Coordinates(9,7));
	}
}
