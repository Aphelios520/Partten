package com.itcast.ObserverPattern.test2;

public class TestMain {
	public static void main(String[] args) {
		ControlAnstract con =new ConcreteController("东方魔龙");
		
		Obsercer j1 = new Invsstor("1号粉");
		con.buyIn(j1);
		Obsercer j2 = new Invsstor("2号粉");
		con.buyIn(j2);
		Obsercer j3 = new Invsstor("3号粉");
		con.buyIn(j3);
		Obsercer j4 = new Invsstor("4号粉");
		con.buyIn(j4);
		Obsercer j5 = new Invsstor("5号粉");
		con.buyIn(j5);
		
		j1.risePice(con);
	}
}
