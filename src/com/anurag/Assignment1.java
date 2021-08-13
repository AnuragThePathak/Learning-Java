package com.anurag;

import java.util.Scanner;

class Assignment1{

    public static void main(String[]args) {

//create two customers.One with saving account and another one with current account
        System.out.println("******For saving account customer*****");

        Scanner str = new Scanner(System.in);
        System.out.println("Enter account no. of saving account customer: ");
        String a= str.nextLine();
        System.out.println("Enter initial balance of saving account customer: ");
        double b= str.nextDouble();

//Deposit money and withdraw money from saving account
        Saving cost1 = new Saving(a,b);
        System.out.println("Enter amount to deposit in saving account: ");
        double d= str.nextDouble();
        cost1.Deposit(d);
        System.out.println("Enter the withdraw amount from saving account: ");
        double e= str.nextDouble();
        cost1.Withdraw(e);

        System.out.println("******For Current account customer*****");

        Scanner str1 = new Scanner(System.in);
        System.out.println("Enter account no. of current account customer: ");
        String f= str1.nextLine();
        System.out.println("Enter initial balance of current account customer: ");
        double g= str1.nextDouble();
        Current cost2 = new Current(f,g);


//Deposit money and withdraw money from saving account

        System.out.println("Enter amount to deposit in current account: ");
        double h= str1.nextDouble();
        cost2.Deposit(h);
        System.out.println("Enter the withdraw amount from current account: ");
        double i= str1.nextDouble();
        cost2.Withdraw(i);

    }
}

//superclass
abstract class BankAccount{
    String accountNumber;
    double balance;

    //Constructor
    BankAccount(String ac, double b){
        accountNumber = ac;
        balance = b;
    }

    void Deposit(double depositAmount){
        System.out.println("Deposited Money into your account:");
        System.out.println("Your previous balance is : " + balance);
        balance= this.balance + depositAmount;
        System.out.println(depositAmount+ "Rs is transferred in your account.Your account updated balance is "+ balance);
        System.out.println();

    }

}

//subclass1
class Saving extends BankAccount{
    double minimumAmount =500;

    Saving(String ac, double b){
        super(ac,b);
    }
    void Withdraw(double  withdrawAmount) {
        if((balance- withdrawAmount)> minimumAmount) {
            balance = balance-withdrawAmount;
            System.out.println("Money is withdrawn from your saving account:");
            System.out.println("Your saving account balance is:" + balance);
        }
        else {
            System.out.println("Your saving account has insufficient balance :" );
            System.out.println();
        }
    }
}

//subclass2
class Current extends BankAccount{
    Current(String ac, double b){
        super(ac,b);
    }
    void Withdraw(double  withdrawAmount) {
        System.out.println("Money is withdrawn from your current account:");
        if(balance>withdrawAmount) {
            System.out.println("Your current  balance is:" + balance);
            balance = this.balance-withdrawAmount;
            System.out.println("Your balance after withdrawing is" + withdrawAmount + "Rs is"+ balance);
        }
        else {
            System.out.println("Your current account has overdrawn by" + (withdrawAmount-balance)+"Rs is" + balance );
        }
        System.out.println();
    }
}