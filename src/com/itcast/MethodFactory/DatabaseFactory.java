package com.itcast.MethodFactory;

public class DatabaseFactory implements Factory {
	
	@Override
	public Logger createLogger() {
		//连接数据库
		//创建数据库日志处理对象
		Logger logger =new DatabaseLogger();
		
		return logger;
	}
}
