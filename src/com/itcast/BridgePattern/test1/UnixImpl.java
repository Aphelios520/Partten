package com.itcast.BridgePattern.test1;

public class UnixImpl implements ImgeImpl {
	@Override
	public void doPaint(Matrix matrix) {
		System.out.println("使用unix显示图像");
	}
}
