package com.itcast.MementoPattern.test1;

public class Client {
	public static void main(String[] args) {
		MementoCaretaker caretaker = new MementoCaretaker();
		Chessman chessman =new Chessman("马",1,1);
		display(chessman);
		caretaker.setMemento(chessman.save());
		chessman.setX(5);
		display(chessman);
		caretaker.setMemento(chessman.save());
		chessman.setY(9);
		display(chessman);
		System.out.println("========悔棋============");
		chessman.restore(caretaker.getMemento());
		display(chessman);
		//棋子马当前位置：第1行第1列
		//棋子马当前位置：第5行第1列
		//棋子马当前位置：第5行第9列
		//========悔棋============
		//棋子马当前位置：第5行第1列
	}
	public static void display(Chessman chessman){
		System.out.println("棋子"+chessman.getLabel()+"当前位置：第"
			+chessman.getX()+"行"+"第"+chessman.getY()+"列");
	}
}
