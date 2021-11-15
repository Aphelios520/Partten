package com.itcast.SimpleFactory;



public class Test {
	public static void main(String[] args) {
		Product english = Factory.getProduct("English");
		english.language();
		english.say();
		Product japanese = Factory.getProduct("Japanese");
		japanese.say();
		japanese.language();
	}
}
