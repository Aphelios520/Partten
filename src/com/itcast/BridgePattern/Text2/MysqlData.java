package com.itcast.BridgePattern.Text2;

public class MysqlData implements Database {
	@Override
	public void onData() {
		System.out.println("mysql数据库显示");
	}
}
