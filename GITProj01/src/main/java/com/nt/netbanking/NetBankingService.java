package com.nt.netbanking;

import java.util.Random;

public class NetBankingService {

	
	public   String openAccount(String addhar, double initialamount, String type) {
		return "account is opened with acc number::"+new Random().nextLong(500000000000L);
	}
	
	
	
	public   String closeAccount() {
		return "Account is closed";
	}
	
	public  String withdraw(long acno, double amount) {
		return  amount+" is withdrawn from  the account number::"+acno;
	}
	
	public  String deposite(long acno, double amount) {
		return  amount+" is deposited in to  the account number::"+acno;
	}
	
	public   String  transferMoney(long srcAcno,long destAcno,  double amount) {
		
		return "transfering "+amount+" from "+srcAcno+"  to "+destAcno;
	}
	
	public  void  abc() {
		System.out.println("abc");
	}
}
