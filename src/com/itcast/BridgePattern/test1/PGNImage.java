package com.itcast.BridgePattern.test1;

public class PGNImage extends Image {
	@Override
	public void parseFile(String fileName) {
		Matrix matrix =new Matrix();
		imge.doPaint(matrix);
		System.out.println("图像格式为PNG，图像名称为"+fileName);
	}
}
