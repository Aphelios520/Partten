package com.itcast.BridgePattern.test1;

public class GIFImage extends Image {
	@Override
	public void parseFile(String fileName) {
		Matrix matrix =new Matrix();
		imge.doPaint(matrix);
		System.out.println("图像的格式为GIF,图像的名称为"+fileName);
	}
}
