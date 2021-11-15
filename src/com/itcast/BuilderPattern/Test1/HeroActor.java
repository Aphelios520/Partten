package com.itcast.BuilderPattern.Test1;

public class HeroActor extends  ActorBuilder{
	
	@Override
	public void buildType() {
		actor.setType("英雄");
	}
	
	@Override
	public void buildSex() {
		actor.setSex("男");
	}
	
	@Override
	public void buildFace() {
		actor.setFace("英俊");
	}
	
	@Override
	public void buildCostume() {
		actor.setCostume("盔甲");
	}
	
	@Override
	public void buildHairStyle() {
		actor.setHairStyle("飘逸");
	}
}
