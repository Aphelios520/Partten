package com.itcast.BridgePattern.Text2;

public class OranleData implements Database {
	@Override
	public void onData() {
		System.out.println("oracle显示数据");
	}
}
