package com.nt.netbanking;

import java.util.Random;

public class NetBankingService {

	
	public   String openAccount(String addhar, double initialamount, String type) {
		return "account is opened with acc number::"+new Random().nextLong(500000000000L);
	}
	
	public  String withdraw(long acno, double amount) {
		return  amount+" is withdrawn from  the account number::"+acno;
	}
	//dafafg
	
	public  String deposite(long acno, double amount) {
		return  amount+" is deposited in to  the account number::"+acno;
	}
	
}
