public class Bankaccount {
    public int acccountNumber; 
    protected String accountHolder; 
    private int balance; 

    public Bankaccount(int acccountNumber,String accountHolder,int balance) { 
        this.acccountNumber=acccountNumber; 
        this.accountHolder=accountHolder; 
        this.balance=balance;
    }
    public int getBalance(){
        return balance;
    }
    public int setBalance(){
        this.balance=balance;
        return balance;
    }
    // public void displayDetails(){
    //     System.out.println("The account Number is "+acccountNumber);
    //     System.out.println("The accountHolder name is "+accountHolder); 
    //     System.out.println("The balance is "+updateBalance(balance));
    
    // }
     static class SavingAccount extends Bankaccount{
        public SavingAccount(int acccountNumber,String accountHolder,int balance){
         
            super(acccountNumber, accountHolder, balance);
        }
        public void displayDetails(){ 
            System.out.println("The accountNumber is"+acccountNumber);
            System.out.println("THe accountHolder is "+accountHolder);
            System.out.println("The balance of the account is "+getBalance());

        }
        

    } 
    public static void main(String[] args) {
        //Bankaccount b=new Bankaccount(5066, "Nishant", 10000); 
        SavingAccount sb=new SavingAccount(10200, "Suraj Raj", 10000000);
        sb.displayDetails();

    }

    
    
}
