package com.itcast.StatePattern.test1;

public class NormalState extends AccountState {
	public NormalState(Account account) {
		this.acc = account;
	}
	
	public NormalState(AccountState state) {
		this.acc =state.acc;
	}
	@Override
	public void deposit(double amount) {
		acc.setBalance(acc.getBalance()+amount);
		stateCheck();
	}
	
	@Override
	public void withdraw(double amount) {
		acc.setBalance(acc.getBalance()-amount);
		stateCheck();
	}
	
	@Override
	public void computeInterest() {
		System.out.println("正常状态，无须利息");
	}
	
	@Override
	public void stateCheck() {
		if(acc.getBalance()>-2000 && acc.getBalance()<=0){
			acc.setState(new OverdraftState(this));
		}else if (acc.getBalance()==-2000){
			acc.setState(new RestrictedState(this));
		}else if(acc.getBalance()<-2000){
			System.out.println("操作受限");
		}
	}
}
