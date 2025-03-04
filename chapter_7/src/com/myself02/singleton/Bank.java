package com.myself02.singleton;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/16 14:49
 */
public class Bank {
    public static void main(String[] args) {
        Bank b1 =  getBank() ;
        Bank b2=    getBank();
    }

    private static Bank b1 =new Bank();

    private Bank(){}

    public  static Bank   getBank(){
        return b1;
    }


}
