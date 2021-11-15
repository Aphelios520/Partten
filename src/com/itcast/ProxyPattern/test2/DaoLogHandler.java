package com.itcast.ProxyPattern.test2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DaoLogHandler implements InvocationHandler {
	private Calendar calendar;
	private Object object;
	
	public DaoLogHandler() {
	}
	
	public DaoLogHandler(Object object) {
		this.object = object;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		beforeInvoke();
		Object invoke = method.invoke(object, args);
		afterInvoke();
		return invoke;
	}
	public void beforeInvoke(){
		calendar = new GregorianCalendar();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		String time = hour+":"+minute+":"+second;
		System.out.println("调用时间为："+time);
	}
	public void afterInvoke(){
		System.out.println("方法调用结束！");
	}
}
