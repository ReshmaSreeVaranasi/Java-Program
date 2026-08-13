package javacore;
class Account {
    int accNo;
   double balance;
    Account (int accNo,double balance){
       this.accNo=accNo;
       this.balance=balance;
   }
   void deposit(double amount){
       balance=balance+amount;
       System.out.println("Deposited: "+amount);
   }
   void withdraw(double amount) {
       if (amount <= balance) {
           balance = balance-amount;
           System.out.println("Withdrawn: " + amount);
       } else {
           System.out.println("Insufficient-Amount can't be taken");
       }
   }
       void display() {
           System.out.println("Account No:" + accNo);
           System.out.println("Balance:" + balance);
       }
   }
    class SavingsAccount extends Account{
       double interestRate;
       SavingsAccount(int accNo,double balance,double interestRate){
           super(accNo, balance);
           this.interestRate=interestRate;
       }
       void calInterest(){
           double interest=balance*interestRate/100;
           balance=balance+interest;
           System.out.println("Interest:"+interest);
       }

    }

class CurrentAccount extends Account{
    double overDraftLimit;
    CurrentAccount(int accNo,double balance,double overDraftLimit) {
        super(accNo,balance);
        this.overDraftLimit=overDraftLimit;
    }
    void withdraw(double amount){
        if(amount<=balance+overDraftLimit){
            balance=amount-balance;
            System.out.println(("Withdrawn: "+amount));
        }
        else{
            System.out.println("Overdraft limit exceeded");
        }
    }

    }

public class BankAccManagement {
       public static  void main(String[] args){
           SavingsAccount sa=new SavingsAccount(2347566,99000,9.0);
           System.out.println("Savings Account");
           sa.deposit(1800);
           sa.withdraw(100);
           sa.calInterest();
           sa.display();
           System.out.println();
           CurrentAccount c= new CurrentAccount(44564,300,567);
           c.deposit(1000);
           c.withdraw(3000);
           c.display();


       }
}
Savings Account
Deposited: 1800.0
Withdrawn: 100.0
Interest:9063.0
Account No:2347566
Balance:109763.0

Deposited: 1000.0
Overdraft limit exceeded
Account No:44564
Balance:1300.0



