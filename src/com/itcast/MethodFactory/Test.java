package com.itcast.MethodFactory;


import com.itcast.MethodFactory.XMLUtil.XMLUtil;

public class Test {
	public static void main(String[] args) {
//		Factory factory =new DatabaseFactory();
//		Logger logger = factory.createLogger();
//		logger.writeLog();
//
//		Factory factory1 =new FileFactory();
//		Logger logger1 = factory1.createLogger();
//		logger1.writeLog();
		Factory bean = (Factory) XMLUtil.getBean(0);
		Logger logger = bean.createLogger();
		logger.writeLog();
		
	}
}
