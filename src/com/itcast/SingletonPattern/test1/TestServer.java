package com.itcast.SingletonPattern.test1;

public class TestServer {
	public static void main(String[] args) {
		LoadBalancer instance1 = LoadBalancer.getInstance();
		LoadBalancer instance2 = LoadBalancer.getInstance();
		LoadBalancer instance3 = LoadBalancer.getInstance();
		LoadBalancer instance4 = LoadBalancer.getInstance();
		if(instance1==instance2 && instance2==instance3 && instance3==instance4){
			System.out.println("所有负载都是均衡的");
		}
		instance1.addServer("server1");
		instance2.addServer("server2");
		instance3.addServer("server3");
		instance4.addServer("server4");
		
		for (int i = 0; i <100 ; i++) {
			String server = instance2.getServer();
			System.out.println(server);
		}
	}
}
