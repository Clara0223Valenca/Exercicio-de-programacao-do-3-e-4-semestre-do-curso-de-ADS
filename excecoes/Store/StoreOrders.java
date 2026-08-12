package Store;

/*5. Um sistema de loja precisa processar pedidos. Crie um método calcularTotal(int quantidade, double preco) que retorna o valor total do pedido e valide:
A - Lance uma exceção QuantidadeInvalidaException se quantidade <= 0, com uma mensagem personalizada.
B - Lance uma exceção PrecoInvalidoException se preço <= 0, com uma mensagem personalizada.
Na classe principal, trate ambas usando a sintaxe Multi-catch (catch (ExceptionA | ExceptionB e)), informando Erro no Pedido e a mensagem específica "A quantidade deve ser maior que zero" ou "O preço deve ser maior que zero".

11/08/26
*/

public class StoreOrders {
    
    public double calcTotal(int quantity, double price) throws InvalidPriceException, InvalidQuantityException{
 
        if (quantity <= 0) {

            throw new InvalidQuantityException("Quantidade deve ser maior que 0");
        }
        if (price <= 0) {
            
            throw new InvalidPriceException("Valor deve ser maior que zero");
        }
        double valueTotal = quantity * price;
        return valueTotal;
    }
}
