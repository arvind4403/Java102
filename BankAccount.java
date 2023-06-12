public class BankAccount {
   private int AccountNo;
   private double AccountBalance;
    private String AccountHolderName;

   public BankAccount(int accountNo, double accountBalance, String AccountHolderName) {
       this.AccountNo = accountNo;
       this.AccountBalance = accountBalance;
       this.AccountHolderName = AccountHolderName;
   }
   public void deposit(double amount){
       AccountBalance+=amount;
   }
   public void withdraw(double amount){
       AccountBalance-=amount;
   }
   public void displayAccountInfo(){
       System.out.println("Account number : "+AccountNo);
       System.out.println("Account Holder Name : "+AccountHolderName);
       System.out.println("Account Balance :"+ AccountBalance);

   }
   public static void main(String[] args){
       BankAccount Account = new BankAccount(1234,50000,"Arvind");
       Account.deposit(15);
       Account.withdraw(16);
       Account.displayAccountInfo();
   }

}
