/*3. Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente. 
30/04/2026 */

package Exerc03;

public class BankAccount {
    
    private double balance;
    
    public double displayBalance() {
        return balance;
    }
    
    public void deposit(double value){
        //get
        if (validateDeposit(value)) {
            
            balance = balance + value;
        }

    }

    public void withdraw(double value){
        //get
        if (validateWithdraw(value)) {
            
            balance = balance - value;
        }

    }

    /*
    / Method validations
    */

    private boolean validateDeposit (double value){

        if (value <= 0) {

            System.out.println("Valor inválido, tente novamente");
            return false;
        } else {

            return true;
        } 
    }

    private boolean validateWithdraw (double value){

        if (value > balance) {

            System.out.println("Não é possível realizar o sacar valor maior que seu saldo");
            return false; 
        } else {

            return true;
        }

    }





    //checkBalance(){}  



}
