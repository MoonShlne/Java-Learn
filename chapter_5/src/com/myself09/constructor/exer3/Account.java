package com.myself09.constructor.exer3;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/6 16:11
 */
public class Account {
  private int id;
  private double balance;
  private double annualInterestRate;

  public  Account(){}
    public  Account(int a,double b, double c){
      id=a;
      balance=b;
      annualInterestRate=c;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public  void  withdraw(double money){
      if (balance < money){
          System.out.println("余额不足");
      }
      else {
          balance-=money;
      }

    }
    public  void  deposit(double money){
      if (money>0){
          balance+=money;
      }
      else {
          System.out.println("输入金额有误");
      }
    }
}
