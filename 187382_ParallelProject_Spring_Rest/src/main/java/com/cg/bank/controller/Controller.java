package com.cg.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bank.bean.Customer;
import com.cg.bank.exception.BankException;
import com.cg.bank.service.BankService;
import com.cg.bank.service.BankTransactionService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Controller {
	@Autowired
	BankTransactionService tservice;
	@Autowired
	BankService bankService;
      @RequestMapping(value = "/createaccount", method = RequestMethod.POST)
	public boolean addCustomer(@RequestBody Customer cust) throws BankException {
		return bankService.addCustomer(cust);
	}
      @RequestMapping(value = "/showbalance/{accountNo}")
  	public double showBalance(@PathVariable int accountNo) throws BankException {
  		return bankService.showBalance(accountNo);
  	}
      @RequestMapping(value = "/login/{username}/{password}")
    	public int  lo(@PathVariable String username,@PathVariable String password) throws BankException {
    		return bankService.loginByUsername(username, password);
    	}
    @RequestMapping(value = "/getCustomerByAccNo/{accountNo}")
	public Customer getCustomer(@PathVariable int accountNo) throws BankException {
		return bankService.getCustomerDetails(accountNo);
	}
	@PutMapping("/customerdeposit/{accountNo}/{amount}")
	public double depositMoney(@PathVariable int accountNo, @PathVariable double amount) throws BankException {
		  tservice.addTransaction("Amount "+amount+" added to account "+accountNo, accountNo);
		  return bankService.depositMoney(accountNo,amount);
	}
	@PutMapping("/customerwithdrawl/{accountNo}/{amount}")
	public double withdrawMoney(@PathVariable int accountNo, @PathVariable double amount) throws BankException {
	    tservice.addTransaction("Amount "+amount+" debited from account "+accountNo, accountNo);
	    return bankService.withdrawMoney(accountNo,amount);
	}
	@PutMapping("/customerfundtransfer/{source}/{destination}/{amount}")
	public String fundTransferUpdate(@PathVariable int source,@PathVariable int destination, @PathVariable long amount) throws BankException {
		 tservice.addTransaction("Amount "+amount+" added to account "+source, source);
	        tservice.addTransaction("Amount "+amount+" debited from account "+destination, destination);
	       	return bankService.fundTransferUpdate(source,destination,amount);
	}
	 @RequestMapping("/getTransactions/all/{id}")
	    public List<String> getTransactions(@PathVariable int id) {
	        return tservice.getTransaction(id);
	    }

}
