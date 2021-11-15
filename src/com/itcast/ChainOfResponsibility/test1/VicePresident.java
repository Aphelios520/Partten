package com.itcast.ChainOfResponsibility.test1;

public class VicePresident extends Approver {
	
	public VicePresident(String name) {
		super(name);
	}
	
	@Override
	public void processRequest(PurchasRequest request) {
		if(request.getAmount()<100000){
			System.out.println("副董事"+this.name+"审批采购单"+request.getNumber()+"金额"+request.getAmount()+"元，采购目的为"+request.getPurpose());
		}else {
			this.approver.processRequest(request);
		}
	}
}
