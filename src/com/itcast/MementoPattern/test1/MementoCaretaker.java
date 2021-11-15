package com.itcast.MementoPattern.test1;

public class MementoCaretaker {
	private ChessmanMemento memento;
	
	public ChessmanMemento getMemento() {
		return memento;
	}
	
	public void setMemento(ChessmanMemento memento) {
		this.memento = memento;
	}
}
