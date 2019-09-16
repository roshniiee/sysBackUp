package com.cg.bank.service;

import java.util.List;

public interface BankTransactionService {
	   void addTransaction(String msg, int num);
	    List<String> getTransaction(int id);

}
