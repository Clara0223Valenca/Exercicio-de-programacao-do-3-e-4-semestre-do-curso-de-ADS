package AccountBank;
public class Main {

    public static void main(String[] args) {

        double value =  17000; 
        
        AccountBank accountBank = new AccountBank();
    
        accountBank.setBalance(500);
    
        try {
    
            accountBank.withdraw(value);
            System.out.println("O valor sacado foi " + value + "\nAgora, o saldo total é:" + accountBank.getBalance());
        } catch (Exception e){
            System.out.println("Falha: " + e.getMessage());
        }
    }
    
}
