package Exerc05;
/*Crie uma subclasse PagamentoBoleto que adiciona um atributo codigoBarras. O método processarPagamento() deve imprimir: "Boleto gerado para o valor de R$ [valor] com sucesso".  */
public class PaymentSlip extends Payment {
    
    private String barcode;

    @Override
    public void processPayment(){

        System.out.println("Boleto gerado para o valor de R$ " + getTotalValue() + " com sucesso");
    }

}
