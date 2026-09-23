// /*Crie outra subclasse PagamentoCartao que adiciona um atributo numeroCartao. O método processarPagamento() deve imprimir: "Cartão [numero] autorizado para o valor de R$ [valor]". Adicione um método específico na classe PagamentoCartao chamado validarCartao() que apenas retorna true se o número do cartão tiver 16 dígitos. */

package Exerc05;

public class PaymentCard extends Payment{
    
    private String cardNumber;

    public PaymentCard(double totalValue, String cardNumber){

        setTotalValue(totalValue);
        this.cardNumber = cardNumber;
    }

    public void processPayment(){

        if (validateCard(cardNumber)){

            System.out.println("Cartão " + cardNumber + " autorizado para o valor de R$ " + getTotalValue());
        } else {

            System.out.println("Número do cartão inválido !!(deve haver 16 dígitos)");
        }
    }

    private boolean validateCard(String cardNumber){

        if (cardNumber.length() == 16) {
            return true;
        } else {
            return false;
        }

    }
    
}


//editor.wordwrap on