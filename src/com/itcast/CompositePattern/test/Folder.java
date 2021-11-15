package com.itcast.CompositePattern.test;

import java.util.ArrayList;

public class Folder extends AbstrcatFile {
	private String name;
	private ArrayList<AbstrcatFile> list =new ArrayList<>();
	
	public Folder(String name) {
		this.name = name;
	}
	
	@Override
	public void add(AbstrcatFile file) {
		list.add(file);
	}
	
	@Override
	public void remove(AbstrcatFile file) {
		list.remove(file);
	}
	
	@Override
	public AbstrcatFile getChild(int i) {
		return list.get(i);
	}
	
	@Override
	public void killVitus() {
		System.out.println("对文件夹"+name+"进行杀毒");
		for (AbstrcatFile obj:list){
			obj.killVitus();
		}
	}
}
