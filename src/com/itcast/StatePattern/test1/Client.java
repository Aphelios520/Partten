package com.itcast.StatePattern.test1;

public class Client {
	public static void main(String[] args) {
		Account acc =new Account("李杰",0.0);
		acc.deposit(1000);
		acc.withraw(2000);
		acc.deposit(1000);
		acc.withraw(4000);
		acc.withraw(1000);
		acc.computeInterest();
		//李杰开户，初始金额为0.0
		//--------------
		//李杰存款1000.0
		//现在余额为1000.0
		//现在账户状态是com.itcast.StatePattern.test1.NormalState
		//----------------
		//李杰取款2000.0
		//现在余额为-1000.0
		//现在账户状态是com.itcast.StatePattern.test1.OverdraftState
		//----------------
		//李杰存款1000.0
		//现在余额为0.0
		//现在账户状态是com.itcast.StatePattern.test1.OverdraftState
		//----------------
		//李杰取款4000.0
		//操作受限
		//现在余额为-4000.0
		//现在账户状态是com.itcast.StatePattern.test1.OverdraftState
		//----------------
		//李杰取款1000.0
		//操作受限
		//现在余额为-5000.0
		//现在账户状态是com.itcast.StatePattern.test1.OverdraftState
		//----------------
		//计算利息
	}
}
