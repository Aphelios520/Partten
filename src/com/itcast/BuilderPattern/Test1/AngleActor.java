package com.itcast.BuilderPattern.Test1;

public class AngleActor extends  ActorBuilder{
	
	@Override
	public void buildType() {
		actor.setType("天使");
	}
	
	@Override
	public void buildSex() {
		actor.setSex("女");
	}
	
	@Override
	public void buildFace() {
		actor.setFace("漂亮");
	}
	
	@Override
	public void buildCostume() {
		actor.setCostume("百褶裙，黑丝");
	}
	
	@Override
	public void buildHairStyle() {
		actor.setHairStyle("披肩长发");
	}
}
