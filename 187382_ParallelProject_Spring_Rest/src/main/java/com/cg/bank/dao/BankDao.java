package com.cg.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.bank.bean.Customer;
@Repository
public interface BankDao extends JpaRepository<Customer, Integer> {
	 @Query("from Customer where accountNo=:actno")
	 	Customer getCustomerByAccountNo(@Param("actno") int accountNo);

	     
	     @Query("from Customer where username=:u")
	     Customer getCustomerByUsername(@Param("u") String username);

}
