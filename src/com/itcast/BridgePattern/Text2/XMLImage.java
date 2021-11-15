package com.itcast.BridgePattern.Text2;

public class XMLImage extends Image {
	@Override
	public void famort(String fileName) {
		database.onData();
		System.out.println("文档格式为xml，文档名称为"+fileName);
	}
}
