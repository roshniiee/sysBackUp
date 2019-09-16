package com.dao;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.bean.Customer;
import com.bean.Transaction;

public class BankDAO {
	HashMap<Long, Customer> hashMap = new HashMap<Long, Customer>();
	HashMap<Transaction,Long> TransactionhashMap = new HashMap<Transaction,Long>();


	public void createAccount(Customer customer) {
		hashMap.put(customer.getAccountNo(), customer);

	}

	public Customer showBalance(long accNo) {
		return hashMap.get(accNo);

	}

	public Customer deposit(long accno, int amount) {
		Customer cust = hashMap.get(accno);
		float initialBalance = cust.getBalance();
		float finalBalance = initialBalance + amount;
		cust.setBalance(finalBalance);

		return cust;

	}

	public Customer withdraw(long accno, int amount) {
		Customer cust = hashMap.get(accno);
		float initialBalance = cust.getBalance();
		float finalBalance = initialBalance - amount;
		cust.setBalance(finalBalance);
		return cust;

	}

	public Customer fundTransfer(long sourceAccNo, long destinationAccNo, int tfamount) {
		Customer sourceCust = hashMap.get(sourceAccNo);
		float SourceinitialBalance = sourceCust.getBalance();
		Customer DestiCust = hashMap.get(destinationAccNo);
		float DestinationinitialBalance = DestiCust.getBalance();
		float sourceFinalbal = SourceinitialBalance - tfamount;
		float destinationFinalbal = DestinationinitialBalance + tfamount;
		sourceCust.setBalance(sourceFinalbal);
		DestiCust.setBalance(destinationFinalbal);
		hashMap.put(destinationAccNo, DestiCust);
		hashMap.put(sourceAccNo, sourceCust);
		return sourceCust;

	}

	public List<Transaction> printTransaction(long accn) {

		Set<Transaction> set = TransactionhashMap.keySet();
		ArrayList<Transaction> arrayList = new ArrayList<>(set);
		return arrayList;
		

	}

	public void addTransaction(Transaction transaction, long accno) {
		TransactionhashMap.put(transaction,accno);

	}

}
