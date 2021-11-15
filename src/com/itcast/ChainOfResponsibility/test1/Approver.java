package com.itcast.ChainOfResponsibility.test1;

public abstract class Approver {
	protected  Approver approver;
	protected String name;
	
	public Approver(String name) {
		this.name = name;
	}
	
	public void setApprover(Approver approver) {
		this.approver = approver;
	}
	
	public abstract void processRequest(PurchasRequest request);
}
