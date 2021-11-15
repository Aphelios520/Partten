package com.itcast.MementoPattern.test1;

import java.util.ArrayList;

public class MementoCaretaker2 {
	private ArrayList<ChessmanMemento> mementosList = new ArrayList<>();
	public ChessmanMemento getMemento(int i){
		return mementosList.get(i);
	}
	public void setMemento(ChessmanMemento memento){
		mementosList.add(memento);
	}
}
