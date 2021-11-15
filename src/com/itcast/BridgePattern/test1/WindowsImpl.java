package com.itcast.BridgePattern.test1;

public class WindowsImpl implements ImgeImpl {
	@Override
	public void doPaint(Matrix matrix) {
		System.out.println("使用windows显示图像");
	}
}
