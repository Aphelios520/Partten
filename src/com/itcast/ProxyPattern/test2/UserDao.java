package com.itcast.ProxyPattern.test2;

public class UserDao implements AbstractUserDao {
	@Override
	public Boolean findUserById(String userId) {
		if(userId.equals("520")){
			System.out.println("查询ID为"+userId+"的用户登录成功");
			return true;
		}else {
			System.out.println("查询ID为"+userId+"的用户登录失败");
			return false;
		}
	}
}
