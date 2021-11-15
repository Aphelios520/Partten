package com.itcast.ChainOfResponsibility.test1;

public class Client {
	public static void main(String[] args) {
		Approver lijie = new Director("李杰");
		Approver haifen = new VicePresident("海峰");
		Approver zhiyuan = new President("志远");
		Approver donshihui = new Congress("董事会");
		
		lijie.setApprover(haifen);
		haifen.setApprover(zhiyuan);
		zhiyuan.setApprover(donshihui);
		//donshihui.setApprover(lijie);
		
		PurchasRequest request1 = new PurchasRequest(45000,1001,"圣剑");
		lijie.processRequest(request1);
		PurchasRequest request2 =new PurchasRequest(60000,1002,"龙虾");
		lijie.processRequest(request2);
		PurchasRequest request3 = new PurchasRequest(200000,1003,"买房");
		lijie.processRequest(request3);
		PurchasRequest request4 = new PurchasRequest(800000,1004,"买挂");
		lijie.processRequest(request4);
		//主任李杰审批采购单1001金额45000.0元，采购目的为圣剑
		//副董事海峰审批采购单1002金额60000.0元，采购目的为龙虾
		//董事长志远审批采购单1003金额200000.0元，采购目的为买房
		//召开董事会审批采购单1004金额800000.0元，采购目的为买挂
	}
}
