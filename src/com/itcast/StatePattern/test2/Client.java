package com.itcast.StatePattern.test2;

public class Client {
	public static void main(String[] args) {
		Switch s1,s2;
		s1 = new Switch("开关一");
		s2 = new Switch("开关二");
		s1.on();
		s2.on();
		s1.off();
		s2.off();
		s2.on();
		s1.on();
		//开关一开关已经打开
		//开关二开关已经打开
		//开关一关闭
		//开关二已经关闭
		//开关二打开
		//开关一开关已经打开
	}
}