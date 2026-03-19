/*1. Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (público). Implemente métodos getters e setters para os atributos privados. Instancie e realize testes.
19/03/2026 */

public class ContaBancaria {

    private String numeroConta;
    private double saldo;
    public String titular;

    public String getNumeroConta(){

        return numeroConta;
    }

    public void setNumeroConta(String numeroConta){

        this.numeroConta = numeroConta;
    }

    public double getSaldo(){

        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}