package AccountBank;

/*1. Crie uma classe ContaBancaria com um atributo saldo. Depois, implemente o método sacar(double valor) e caso o valor do saque exceda o saldo atual, o método deve lançar uma exceção informando que o saldo é insuficiente, contendo o valor do saldo atual e o valor que o usuário tentou sacar. Implemente também os métodos get e set para saldo. Teste sacar através de uma classe principal, tratando a exceção.

04/08/2026*/



public class AccountBank{

    private double balance; 

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double value) throws Exception{

        if (value > balance) 
            throw new Exception("O saque não pode ser maior que o saldo, tente outro valor\nSaldo atual: " + balance);
        else
            balance = balance - value;
    }

    //new thwow Exception
}