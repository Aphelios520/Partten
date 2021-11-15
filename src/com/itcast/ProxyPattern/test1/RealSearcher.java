package com.itcast.ProxyPattern.test1;

public class RealSearcher implements Searcher {
	@Override
	public String doSearcher(String userId, String keyword) {
		System.out.println("用户"+userId+"使用关键词"+keyword+"查询相关业务");
		return "返回具体内容";
	}
}
