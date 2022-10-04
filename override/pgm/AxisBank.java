package com.override.pgm;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		
		System.out.println("This 2,50,000 is Deposited by Saving Bank Account from Axis Bank");
	}
	
	public static void main(String[] args) {
		
		AxisBank ab = new AxisBank();
			
		ab.saving();
		ab.fixed();
		ab.deposit();
	}

}
