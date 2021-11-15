package com.itcast.PrototypePattern.test1.simpleClone;

public class WeekLog implements Cloneable{
	private Attachment attachment;
	private String name;
	private String date;
	private String content;
	
	public Attachment getAttachment() {
		return attachment;
	}
	
	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	public WeekLog clone(){
		try {
			Object clone = super.clone();
			return  (WeekLog)clone;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
