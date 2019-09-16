package com.cg.bank.service;
import java.util.List;
import com.cg.bank.bean.Customer;
import com.cg.bank.exception.BankException;

public interface BankService {
	public boolean addCustomer(Customer cust) throws BankException;
	   

	   
    public int loginByUsername(String username, String password) throws BankException;
   
    public double depositMoney(int accountNo, double amount) throws BankException;
   
    public double withdrawMoney(int accountNo,double amount) throws BankException;
   
    public double showBalance(int accountNo) throws BankException;
   
    public String  fundTransferUpdate(int accountNo1,int accountNo2,double amount) throws BankException;

    Customer getCustomerDetails(int accountNo) throws BankException;

}
