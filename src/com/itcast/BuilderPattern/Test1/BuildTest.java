package com.itcast.BuilderPattern.Test1;

import com.itcast.BuilderPattern.XMLUtil.XMLUtil;

public class BuildTest {
	public static void main(String[] args) {
		ActorBuilder hero =(ActorBuilder) XMLUtil.getBean(0);
		
		ActorController controller =new ActorController();
		Actor heroActor = controller.construct(hero);
		
		System.out.println(heroActor.toString());
		
	}
}
