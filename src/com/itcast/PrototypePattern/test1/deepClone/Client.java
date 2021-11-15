package com.itcast.PrototypePattern.test1.deepClone;

import java.io.IOException;

public class Client {
	public static void main(String[] args) {
		Attachment attachment =new Attachment();
		WeekLog old = new WeekLog();
		old.setAttachment(attachment);
		WeekLog clone = null;
		try {
			 clone = old.deepClone();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(old==clone);
		System.out.println(old.equals(clone));
		System.out.println(old.getAttachment()==clone.getAttachment());
		System.out.println(old.getAttachment().equals(clone.getAttachment()));
	}
}
