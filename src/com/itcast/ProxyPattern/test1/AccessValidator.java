package com.itcast.ProxyPattern.test1;

public class AccessValidator {
	
	public boolean validator(String userId){
		System.out.println("验证用户"+userId+"是否合法");
		if(userId.equals("9587")){
			System.out.println(userId+"登录成功");
			return true;
		}else {
			System.out.println(userId+"登录失败");
			return false;
		}
	}
}
