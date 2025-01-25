package Hierarichal;
class BankAccount{//super class
    private String accountNumber;//instance variable
    private int balance;
    BankAccount(String accountNumber,int balance) {//constructor
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void showDetail(){//method for showing the details
        System.out.println("The account number of the customer is "+this.accountNumber);
        System.out.println("The balance of the customer is "+this.balance);
    }
}
class SavingAccount extends BankAccount {//subclass for saving account
    String accountype;

    SavingAccount(String accountNumber, int balance, String accountype) {//constructor for saving account
        super(accountNumber, balance);//calling the constructor of the super class
        this.accountype = accountype;//initializing the instance variable
    }
@Override
    public void showDetail() {//overriding the method of the super class
        super.showDetail();//calling the method of the super class
        System.out.println("Account type is " + this.accountype);//printing the account type
    }
}
class CheckingAccount extends BankAccount{//subclass for checking account
    String accountType;
    CheckingAccount(String accountNumber,int balance,String accountType){//constructor for checking account
        super(accountNumber,balance);//calling the constructor of the super class
        this.accountType=accountType;//initializing the instance variable

    }
    @Override
    public void showDetail(){//overriding the method of the super class
        super.showDetail();
        System.out.println("The type of bank account is "+this.accountType);
    }

}
class FixedDepositAccount extends BankAccount{//subclass for fixed deposit account
    String bankAccountType;
    FixedDepositAccount(String accountNumber,int balance,String bankAccountType){//constructor for fixed deposit account
        super(accountNumber,balance);
        this.bankAccountType=bankAccountType;
    }

    @Override
    public void showDetail() {
        super.showDetail();
        System.out.println("The type of bank is "+this.bankAccountType);//printing the type of bank
    }
}
public class Bank {
    public static void main(String[] args) {//main method for testing the classes
        FixedDepositAccount fd = new FixedDepositAccount("011111", 20000, "Saving");
        fd.showDetail();
    }
}
/*
Sample Problem 1: Bank Account Types
Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
Tasks:
Define a base class BankAccount with attributes like accountNumber and balance.
Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
Implement a method displayAccountType() in each subclass to specify the account type.
Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass.

 */
