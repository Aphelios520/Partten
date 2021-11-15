package com.itcast.MementoPattern.test1;

public class Client2 {
	private static MementoCaretaker2  caretaker = new MementoCaretaker2();
	private static int index=-1;
	public static void main(String[] args) {
		Chessman chessman =new Chessman("象",2,1);
		play(chessman);
		chessman.setY(8);
		play(chessman);
		chessman.setX(7);
		play(chessman);
		undo(chessman,index);
		undo(chessman,index);
		redo(chessman,index);
		redo(chessman,index);
		//棋子象当前位置：第2行第1列
		//棋子象当前位置：第2行第8列
		//棋子象当前位置：第7行第8列
		//===悔棋===
		//棋子象当前位置：第2行第8列
		//===悔棋===
		//棋子象当前位置：第2行第1列
		//====撤销悔棋===
		//棋子象当前位置：第2行第8列
		//====撤销悔棋===
		//棋子象当前位置：第7行第8列
	}
	public static void play(Chessman chessman){
		caretaker.setMemento(chessman.save());
		index++;
		System.out.println("棋子"+chessman.getLabel()+"当前位置：第"
			+chessman.getX()+"行"+"第"+chessman.getY()+"列");
	}
	public static void undo(Chessman chessman,int i){
		System.out.println("===悔棋===");
		index--;
		chessman.restore(caretaker.getMemento(i-1));
		System.out.println("棋子"+chessman.getLabel()+"当前位置：第"
			+chessman.getX()+"行"+"第"+chessman.getY()+"列");
	}
	public static void redo(Chessman chessman,int i){
		System.out.println("====撤销悔棋===");
		index++;
		chessman.restore(caretaker.getMemento(i+1));
		System.out.println("棋子"+chessman.getLabel()+"当前位置：第"
			+chessman.getX()+"行"+"第"+chessman.getY()+"列");
	}
}
