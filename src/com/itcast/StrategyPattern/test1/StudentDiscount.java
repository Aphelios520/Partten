package com.itcast.StrategyPattern.test1;


public class StudentDiscount implements Discount {
	private final double DISCOUNT = 0.8;
	@Override
	public double calculate(double price) {
		System.out.println("学生票");
		return price*DISCOUNT;
	}
}
