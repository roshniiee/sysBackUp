package com.cg.bank.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "transaction")
@Entity
public class Transaction {
	    @Id
	    @GeneratedValue
	    int id;
	    int num;
	    String msg;
	    
	    public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getMsg() {
	        return msg;
	    }
	    public void setMsg(String msg) {
	        this.msg = msg;
	    }
	    @Override
	    public String toString() {
	        return "Transaction [id=" + id + ", num=" + num + ", msg=" + msg + "]";
	    }
	    public int getNum() {
	        return num;
	    }
	    public void setNum(int num) {
	        this.num = num;
	    }
	    public Transaction() {
	       
	    }
	    public Transaction(int id,String msg, int num) {
	        this.id = id;
	        this.msg = msg;
	        this.num = num;
	    }

}
