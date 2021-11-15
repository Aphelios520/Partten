package com.itcast.BridgePattern.test1;

import com.itcast.BridgePattern.XMLUtil.XMLUtil;

public class TestBridge {
	public static void main(String[] args) {
		ImgeImpl imge  =(ImgeImpl)XMLUtil.getBean(0);
		GIFImage gif = (GIFImage)XMLUtil.getBean(1);
		gif.setImge(imge);
		gif.parseFile("hahaha.gif");
	}
}
