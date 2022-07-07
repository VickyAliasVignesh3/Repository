package org.bank;

public class AxisBank extends BankInfo{
	@Override 
	public void saving() {
		System.out.println("Savings- 4%.");
	}
	@Override
	public void fixed() {
		System.out.println("Fixed- 5%.");
	}
	@Override
	public void deposit() {
		System.out.println("Deposit- 6%.");
	}
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.saving();
		a.fixed();
		a.deposit();
	}
}
