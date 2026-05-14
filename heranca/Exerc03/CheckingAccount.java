/*Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente. 
30/04/2026 */

package Exerc03;

public class CheckingAccount extends BankAccount {
    
    public void chargeMonthlyFee() {
        withdraw(10);
        System.out.println("A tarifa mensal de R$ 10,00 foi descontada");
    }
}
