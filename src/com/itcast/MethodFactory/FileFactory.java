package com.itcast.MethodFactory;

public class FileFactory implements Factory {
	@Override
	public Logger createLogger() {
		//创建文件记录日志对象
		Logger logger =new FileLogger();
		
		return logger;
	}
}
