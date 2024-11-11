package com.nt.netbanking;

import java.util.Random;

public class NetBankingService {

	
	public   String openAccount(String addhar, double initialamount, String type) {
		return "account is opened with acc number::"+new Random().nextLong(500000000000L);
	}
	
	public   String closeAccount() {
		return "Account is closed";
	}
	
	
}
