package com.itcast.TemplateMethod.test;

import com.itcast.TemplateMethod.XMLUtil.XMLUtil;

public class Client {
	public static void main(String[] args) {
		Account account = (Account) XMLUtil.getBean(0);
		account.handle("xxxx","123456");
		account.handle("李杰","123456");
		//账号是：xxxx
		//密码是：123456
		//账号或者密码错误
		//账号是：李杰
		//密码是：123456
		//按活期利率计算利息
		//显示利息
	}
}
