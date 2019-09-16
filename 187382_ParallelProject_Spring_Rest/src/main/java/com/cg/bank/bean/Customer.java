package com.cg.bank.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Entity
public class Customer {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int accountNo;
		//@Pattern(regexp="[A-Z][a-z]*")
		private String firstName;
		//@Pattern(regexp="[A-Z][a-z]*")
		private String lastname;
		//@Pattern(regexp="[A-Za-z//@//.com]{2,}")
		private String emailId;
		//@Size(min=5, max=8)
		private String password;
		//@Size(min=5, max=15)
		//@Pattern(regexp="[A-Za-z]*[A-Za-z][0-9]*")
		private String username;
	    //@Size(min=12, max=12)
		private String aadharNumber;
		//@Size(min=10, max=10)
		private String Phonenumber;
		private double balance;
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		public int getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(int accountNo) {
			this.accountNo = accountNo;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getAadharNumber() {
			return aadharNumber;
		}
		public void setAadharNumber(String aadharNumber) {
			this.aadharNumber = aadharNumber;
		}
		public String getPhonenumber() {
			return Phonenumber;
		}
		public void setPhonenumber(String phonenumber) {
			Phonenumber = phonenumber;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		
	

}
