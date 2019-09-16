package com.service;

import com.dao.BankDAO;

import java.util.List;

import com.bean.Customer;
import com.bean.Transaction;

public class BankService {
	public Customer getByAccountNumber(long accno) {
		// TODO Auto-generated method stub
		return null;
	}

	BankDAO bankDAO = new BankDAO();

	public void createAccount(Customer customer) {
		bankDAO.createAccount(customer);

	}

	public Customer showBalance(long accNo) {
		return bankDAO.showBalance(accNo);

	}

	public Customer deposit(long accno, int amount) {
		
		return bankDAO.deposit(accno,amount);
	}

	public Customer withdraw(long accno, int amount) {
		return bankDAO.withdraw(accno,amount);
		
	}

	public Customer fundTransfer(long sourceAccNo, long destinationAccNo, int tfamount) {
		return bankDAO.fundTransfer(sourceAccNo,destinationAccNo,tfamount);
		
	}


	

	public List<Transaction> printTransactions(long accn) {
		return bankDAO.printTransaction(accn);
		
		
	}
	public void addTransaction(Transaction transaction, long accno) {
		bankDAO.addTransaction(transaction, accno);		
	}

}
