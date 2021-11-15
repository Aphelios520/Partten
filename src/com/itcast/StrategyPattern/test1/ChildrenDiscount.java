package com.itcast.StrategyPattern.test1;

public class ChildrenDiscount implements Discount {
	private final double DISCOUNT = 10;
	@Override
	public double calculate(double price) {
		System.out.println("儿童票:");
		if(price>20.0){
			return  price-10;
		}
		return price;
	}
}
