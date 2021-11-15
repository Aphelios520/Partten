package com.itcast.ObserverPattern.test1;

public class Client {
	public static void main(String[] args) {
		AllControlCenter acc =new ConcreteAllyControlCenter("渣渣五人组");
		Observer player1 = new Player("高海峰");
		acc.join(player1);
		Observer player2 = new Player("李杰");
		acc.join(player2);
		Observer player3 = new Player("刘垣灼");
		acc.join(player3);
		Observer player4 = new Player("李志远");
		acc.join(player4);
		Observer player5 = new Player("范清珅");
		acc.join(player5);
		System.out.println("---------------");
		//受到攻击
		player1.beAttacked(acc);
		//渣渣五人组战队组建成功
		//------------------
		//高海峰加入渣渣五人组战队！
		//李杰加入渣渣五人组战队！
		//刘垣灼加入渣渣五人组战队！
		//李志远加入渣渣五人组战队！
		//范清珅加入渣渣五人组战队！
		//---------------
		//高海峰被攻击！
		//渣渣五人组战队紧急通知盟友高海峰受到敌人攻击
		//坚持住，李杰来救你了
		//坚持住，刘垣灼来救你了
		//坚持住，李志远来救你了
		//坚持住，范清珅来救你了
	}
}
