package com.example.AppLearning.entity;

//import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CustomerList")
public class UserEntity {

	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	 private String name;
	 private String category;
	 
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	 private String date;
	 private int loannum;
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getLoannum() {
		return loannum;
	}
	public void setLoannum(int loannum) {
		this.loannum = loannum;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getDebit() {
		return debit;
	}
	public void setDebit(int debit) {
		this.debit = debit;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getDuenum() {
		return duenum;
	}
	public void setDuenum(int duenum) {
		this.duenum = duenum;
	}
	private int credit;
	 private int debit;
	 private int balance;
	 private int duenum;
	
	 
}
	 