package com.itcast.StrategyPattern.test1;

import com.itcast.StrategyPattern.XMLUtil.XMLUtil;

public class Client {
	public static void main(String[] args) {
		MovieTicket ticket = new MovieTicket();
		double originalPrice = 60 ;
		double currentPrice;
		
		ticket.setPrice(originalPrice);
		System.out.println("原始价格为："+originalPrice);
		System.out.println("=================");
		Discount discount = (Discount)XMLUtil.getBean(2);
		ticket.setDiscount(discount);
		
		currentPrice=ticket.getPrice();
		System.out.println("折扣后价格为："+currentPrice);
		//原始价格为：60.0
		//=================
		//儿童票:
		//折扣后价格为：50.0
		//原始价格为：60.0
		//=================
		//学生票
		//折扣后价格为：48.0
		//原始价格为：60.0
		//=================
		//VIP票:
		//增加积分
		//折扣后价格为：30.0
	}
}
