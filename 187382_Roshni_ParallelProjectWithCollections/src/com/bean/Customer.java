package com.bean;

public class Customer {
private String name;
private long phoneNo;
private long accountNo;
private float balance;
private long aadharNo;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(String name, long phoneNo, long accountNo, float balance, long aadharNo) {
	super();
	this.name = name;
	this.phoneNo = phoneNo;
	this.accountNo = accountNo;
	this.balance = balance;
	this.aadharNo = aadharNo;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", phoneNo=" + phoneNo + ", accountNo=" + accountNo + ", balance=" + balance
			+ ", aadharNo=" + aadharNo + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public float getBalance() {
	return balance;
}

public void setBalance(float balance) {
	this.balance = balance;
}
public long getAadharNo() {
	return aadharNo;
}
public void setAadharNo(long aadharNo) {
	this.aadharNo = aadharNo;
}
}
