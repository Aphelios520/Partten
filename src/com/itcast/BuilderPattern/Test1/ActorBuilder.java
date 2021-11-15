package com.itcast.BuilderPattern.Test1;

public abstract class ActorBuilder {
	//把actor定义为protected，就可以实现类的子类访问到这个对象，以免重复创建
	protected Actor actor =new Actor();
	
	public abstract void buildType();
	public abstract void buildSex();
	public abstract void buildFace();
	public abstract void buildCostume();
	public abstract void buildHairStyle();
	
	public Actor createActor(){
		return actor;
	}
	
}
