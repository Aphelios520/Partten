package com.itcast.CompositePattern.test;

public class TestFile extends AbstrcatFile {
	private String name;
	
	public TestFile(String name) {
		this.name = name;
	}
	
	@Override
	public void add(AbstrcatFile file) {
	
	}
	
	@Override
	public void remove(AbstrcatFile file) {
	
	}
	
	@Override
	public AbstrcatFile getChild(int i) {
		return null;
	}
	
	@Override
	public void killVitus() {
		System.out.println("对文件"+name+"进行杀毒");
	}
}
