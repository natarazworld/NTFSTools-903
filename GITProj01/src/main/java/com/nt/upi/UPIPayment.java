package com.nt.upi;

import java.util.Random;

public class UPIPayment {
	
	
	public   String  doUPIPayment(String upiId,double amount) {
		return "UPI Payment for the amount::"+amount+" is done";
				
	}
	
	public   double   checkBalance(String upid) {
		return new Random().nextInt(1200000);
	}

}
