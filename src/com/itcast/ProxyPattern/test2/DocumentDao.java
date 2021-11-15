package com.itcast.ProxyPattern.test2;

public class DocumentDao implements AbstractDocumentDao {
	@Override
	public boolean deleteDocumentById(String userId) {
		if(userId.equals("D001")){
			System.out.println("删除id为"+userId+"的文档信息成功");
			return true;
		}else {
			System.out.println("删除id为"+userId+"的文档信息失败");
			return false;
		}
	}
}
