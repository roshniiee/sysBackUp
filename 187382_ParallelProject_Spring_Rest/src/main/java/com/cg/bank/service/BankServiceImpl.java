package com.cg.bank.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bank.bean.Customer;
import com.cg.bank.dao.BankDao;
import com.cg.bank.exception.BankException;
@Service
public class BankServiceImpl implements BankService {
	@Autowired
	BankDao bankdao;

	public boolean addCustomer(Customer cust) throws BankException {
		
			try {
				bankdao.save(cust);
			return	true;
			}
			catch(Exception ex)
			{
				throw new BankException("Check the details properly");
			}
	}

	@Override
	public Customer getCustomerDetails(int accountNo) throws BankException {
		try
		{
		return bankdao.getCustomerByAccountNo(accountNo);
		}
		catch(Exception ex)
		{
			throw new BankException("Pleas enter valid account number");
		}
	}

	@Override
	public int loginByUsername(String username, String password) throws BankException {
		try
		{
			Customer cust=bankdao.getCustomerByUsername(username);
			 if(cust.getPassword().equals(password))
			        return cust.getAccountNo();
			        else
			        {
			            throw new BankException("Pleas enter valid username and password");
			       
			        }
			        }
			        catch(Exception ex)
			        {
			            throw new BankException("Pleas enter valid username and password");
			        }
			        }
	

	@Override
	public double depositMoney(int accountNo, double amount) throws BankException
	{
		try{
			Customer cust=bankdao.getCustomerByAccountNo(accountNo);
		
		double remBal=cust.getBalance()+amount;
		cust.setBalance(remBal);
	     bankdao.save(cust);
	     return cust.getBalance();
		}
		catch(Exception ex)
		{
			throw new BankException("Pleas enter valid account number and password");
		}
		
	}

	@Override
	public double withdrawMoney(int accountNo, double amount) throws BankException {
		// TODO Auto-generated method stub
		try
		{
		Customer cust=bankdao.getCustomerByAccountNo(accountNo);
		double remBal=cust.getBalance()-amount;
		 cust.setBalance(remBal);
	     bankdao.save(cust);
		return cust.getBalance();
		}
		catch(Exception ex)
		{
			throw new BankException("Please enter valid account number and password");
		}
	}

	@Override
	public double showBalance(int accountNo) throws BankException {
		try
		{
		Customer cust=bankdao.getCustomerByAccountNo(accountNo);
		return cust.getBalance();
		}
		catch(Exception ex)
		{
			throw new BankException("Please enter valid account number");
		}
		
	}

	@Override
	public String fundTransferUpdate(int accountNo1, int accountNo2, double amount) throws BankException {
		try {
		Customer cust1=bankdao.getCustomerByAccountNo(accountNo1);
		double remBal1=(cust1.getBalance()-amount);
		cust1.setBalance(remBal1);
		  bankdao.save(cust1);
		Customer cust2=bankdao.getCustomerByAccountNo(accountNo2);
		double remBal2=cust2.getBalance()+amount;
		cust2.setBalance(remBal2);
		bankdao.save(cust2);
		return "Changes Done Scuccessfully";
		}
		catch(Exception ex)
		{
			throw new BankException("Pleas enter valid source and destination correct");
		}
	}
}
