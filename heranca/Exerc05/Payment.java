package Exerc05;
/*5. Desenvolva um sistema de pagamento de E-commerce. Para isto, crie uma classe abstrata Pagamento com um atributo valorTotal, e um método abstrato processarPagamento(). Crie uma subclasse PagamentoBoleto que adiciona um atributo codigoBarras. O método processarPagamento() deve imprimir: "Boleto gerado para o valor de R$ [valor] com sucesso". Crie outra subclasse PagamentoCartao que adiciona um atributo numeroCartao. O método processarPagamento() deve imprimir: "Cartão [numero] autorizado para o valor de R$ [valor]". Adicione um método específico na classe PagamentoCartao chamado validarCartao() que apenas retorna true se o número do cartão tiver 16 dígitos. */
public abstract class Payment {
    
    private double totalValue;

    public abstract void processPayment();

    public double getTotalValue() {
        return totalValue;
    }
    
    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}
