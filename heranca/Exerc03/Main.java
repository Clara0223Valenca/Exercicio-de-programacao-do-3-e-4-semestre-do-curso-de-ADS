package Exerc03;

public class Main {
    
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount();

        account1.displayBalance();

        account1.deposit(100);

        account1.displayBalance();

        account1.withdraw(30);
        account1.displayBalance();

        account1.deposit(-1);
        
        account1.withdraw(100);
        account1.displayBalance();

        CheckingAccount account2 = new CheckingAccount();

        account2.deposit(200);
        account2.displayBalance();
        account2.chargeMonthlyFee();
        account2.displayBalance();
  
    }
}
