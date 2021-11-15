package com.itcast.BridgePattern.test1;

public class LinuxImpl implements ImgeImpl {
	@Override
	public void doPaint(Matrix matrix) {
		System.out.println("使用linux显示图像");
	}
}
