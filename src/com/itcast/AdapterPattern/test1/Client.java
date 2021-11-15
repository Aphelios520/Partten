package com.itcast.AdapterPattern.test1;


import com.itcast.AdapterPattern.XMLUtil.XMLUtil;

public class Client {
	public static void main(String[] args) {
		CarTarget carTarget  =(CarTarget) XMLUtil.getBean(0);
		carTarget.move();
		carTarget.phonate();
		carTarget.twinkle();
	}
}
