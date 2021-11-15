package com.itcast.BridgePattern.Text2;

import com.itcast.BridgePattern.XMLUtil.XMLUtil;

public class TextTest {
	public static void main(String[] args) {
		Database mysql =(Database) XMLUtil.getBean(2);
		Image pdf = (Image)XMLUtil.getBean(3);
		pdf.setDatabase(mysql);
		pdf.famort("黄图.pdf");
	}
}
