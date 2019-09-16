package com.cg.bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bank.bean.Transaction;
import com.cg.bank.dao.BankTransactionDao;
@Service
public class BankTranscationImpl implements BankTransactionService {
    @Autowired
	 BankTransactionDao to;
	@Override
	public void addTransaction(String msg, int num) {
	      int id = (int) Math.ceil((Math.random()*1000));
          Transaction t = new Transaction(id, msg, num);
          to.save(t);
	}

	@Override
	public List<String> getTransaction(int id) {
        List<Transaction> ls = to.findAll();
        List<String> listShow = new ArrayList<String>();
        for(Transaction t: ls) {
            if(t.getNum() == id) {
                listShow.add(t.getMsg());
            }
        }
        return listShow;
	}

}
