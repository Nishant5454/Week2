package problems.BankingSystem;

class SavingAccount extends BankAccount implements BankAccount.Lonable{
    private String accountType;
    private int currentBalance;
    private int cibilScore;

    SavingAccount(String accountNumber,String accountHolderName,int balance,String accountType,int currentBalance,int cibilScore){
        super(accountNumber,accountHolderName,balance);
        this.accountType=accountType;
        this.currentBalance=currentBalance;
        this.cibilScore=cibilScore;
    }
    @Override
    public int depositAmount(int amount){
        int newBalance=getBalance()+amount;
        setBalance(newBalance);
        return newBalance;


    }
    @Override
    public int withdrawAmount(int amount){
        int newBalance=getBalance()-amount;
        setBalance(newBalance);
        return newBalance;
    }
    @Override
    public void applyforLoan(){
        if(calculateLoanEligibility()){
            System.out.println("You are Eligible for loan up to "+getBalance());


        }

    }
    @Override
    public boolean calculateLoanEligibility(){
        if(currentBalance>10000||cibilScore>=900){
           // System.out.println("Eligible for loan");
            return true;
        }
        else{
           // System.out.println("Not Eligible for Loan");
            return false;
        }

    }
    @Override
    public double calculateIntrest(){
        double totalIntrest=Math.random()*this.currentBalance;
      //  System.out.println("Intrest rate up to loan "+this.currentBalance+" is "+Math.random()*this.currentBalance);
        return totalIntrest;
    }
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + getAccountHolderName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: ₹" + getBalance());
        System.out.println("Cibil Score is "+this.cibilScore);
        System.out.println("The total Intrest on the account is "+calculateIntrest());
        System.out.println("Is the account is eligible for loan "+calculateLoanEligibility());
    }
}
