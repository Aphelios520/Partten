package com.itcast.ProxyPattern.test1;

import com.itcast.ProxyPattern.XMLUtil.XMLUtil;

import java.lang.reflect.Proxy;

public class ProxyTest {
	public static void main(String[] args) {
		Searcher proxy = (Searcher) XMLUtil.getBean(0);
		proxy.doSearcher("9587","258");

	}
}
