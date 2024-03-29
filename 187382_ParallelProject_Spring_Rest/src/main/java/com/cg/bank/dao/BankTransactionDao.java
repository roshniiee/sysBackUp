package com.cg.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bank.bean.Transaction;
@Repository
public interface BankTransactionDao extends JpaRepository<Transaction, Integer> {

}
