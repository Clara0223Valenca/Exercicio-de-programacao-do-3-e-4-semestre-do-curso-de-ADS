/*1. Crie uma classe ContaBancaria com os seguintes atributos: accountNumber (privado), saldo (privado) e titular (público). Implemente métodos getters e setters para os atributos privados. Instancie e realize testes.
19/03/2026 */

public class BankAccount {

    private int accountNumber;
    private double balance;
    public String holder;

    public int getAccountNumber(){

        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){

        this.accountNumber = accountNumber;
    }

    public double getBalance(){

        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
}