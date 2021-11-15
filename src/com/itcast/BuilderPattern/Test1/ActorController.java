package com.itcast.BuilderPattern.Test1;

public class ActorController {
	
	public Actor construct(ActorBuilder ab){
		Actor actor;
		ab.buildType();
		ab.buildSex();
		ab.buildCostume();
		ab.buildFace();
		ab.buildHairStyle();
		actor = ab.createActor();
		return actor;
	}
}
