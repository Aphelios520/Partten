package com.itcast.CompositePattern.test;

public abstract class AbstrcatFile {
	public abstract void add(AbstrcatFile file);
	public abstract void remove(AbstrcatFile file);
	public abstract AbstrcatFile getChild(int i);
	public abstract void killVitus();
}
