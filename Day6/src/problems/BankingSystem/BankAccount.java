package problems.BankingSystem;

abstract class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private int balance;
    BankAccount(String accountNumber,String accountHolderName,int balance){
       // this.accountHolderName=accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public int depositAmount(int amount){
        balance+=amount;
        return balance;
    }
    public int withdrawAmount(int amount){
        balance-=amount;
        return balance;
    }
    abstract  double calculateIntrest();
    interface Lonable{
        void applyforLoan();
        boolean calculateLoanEligibility();
    }

}
