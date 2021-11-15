package com.itcast.ProxyPattern.test2;
	
	import java.lang.reflect.InvocationHandler;
	import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		InvocationHandler handler = null;
		AbstractUserDao userDao = new UserDao();
		handler = new DaoLogHandler(userDao);
		AbstractUserDao proxy = null;
		
		//proxy = (AbstractUserDao)Proxy.newProxyInstance(AbstractUserDao.class.getClassLoader(),AbstractUserDao.class.getInterfaces(),handler);
		//proxy =(AbstractUserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), handler);
		proxy = (AbstractUserDao) Proxy.newProxyInstance(AbstractUserDao.class.getClassLoader(),new Class[]{AbstractUserDao.class},handler);
		proxy.findUserById("520");
		System.out.println("===================================");
		AbstractDocumentDao documentDao = new DocumentDao();
		handler = new DaoLogHandler(documentDao);
		AbstractDocumentDao proxy2 = null;
		
		proxy2 = (AbstractDocumentDao) Proxy.newProxyInstance(AbstractDocumentDao.class.getClassLoader(),new Class[]{AbstractDocumentDao.class},handler);
		proxy2.deleteDocumentById("D001");
		//调用时间为：10:0:6
		//查询ID为520的用户登录成功
		//方法调用结束！
		//===================================
		//调用时间为：10:0:6
		//删除id为D001的文档信息成功
		//方法调用结束！
	}
}
