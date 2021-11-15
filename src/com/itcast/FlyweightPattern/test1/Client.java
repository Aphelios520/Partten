package com.itcast.FlyweightPattern.test1;

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
		
		b1.display();
		b2.display();
		b3.display();
		w1.display();
		w2.display();
	}
}
