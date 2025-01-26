package problems.BankingSystem;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount=new SavingAccount("CBI204646362","Nishant Kumar",2000,"Saving",2000,975);
        savingAccount.setAccountNumber("CBI20464632");
        savingAccount.setAccountHolderName("Nishant Kumar");
        savingAccount.depositAmount(400);
        savingAccount.withdrawAmount(34);
        savingAccount.displayAccountDetails();
        savingAccount.calculateLoanEligibility();
        savingAccount.applyforLoan();
        System.out.println("**********************************************************************");
        CurrentAccount currentAccount=new CurrentAccount("CBI46565","SURAJ RAJ",2000,"Current",2000,893);
        currentAccount.setAccountNumber("CBI20464632");
        currentAccount.setAccountHolderName("SURAJ RAJ");
        currentAccount.depositAmount(400);
        currentAccount.withdrawAmount(34);
        currentAccount.displayAccountDetails();
        currentAccount.calculateLoanEligibility();
        currentAccount.applyforLoan();




    }
}
/*
Description: Create a banking system with different account types:
Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
Use encapsulation to secure account details and restrict unauthorized access.
Demonstrate polymorphism by processing different account types and calculating interest dynamically.

 */