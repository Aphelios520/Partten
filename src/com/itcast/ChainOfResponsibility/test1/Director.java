package com.itcast.ChainOfResponsibility.test1;

public class Director extends Approver {
	public Director(String name) {
		super(name);
	}
	
	@Override
	public void processRequest(PurchasRequest request) {
		if(request.getAmount()<50000){
			System.out.println("主任"+this.name+"审批采购单"+request.getNumber()+"金额"+request.getAmount()+"元，采购目的为"+request.getPurpose());
		}else {
			this.approver.processRequest(request);
		}
	}
}
