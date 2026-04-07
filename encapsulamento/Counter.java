/*6. Escreva uma classe Contador, que encapsule um valor usado para contagem de itens ou eventos. A classe deve oferecer métodos que devem: Zerar; Incrementar; Setar um valor ao contador; Retornar o valor do contador.
30/03/2026 */
public class Counter {

    private int value;

    public void setValue (int value){

        this.value = value;
    } 

    public int getValue(){

        return value;
    }

    public void reset(){

        value = 0;
    } 
    
    public void increase(){
        
        this.value++;

    } 
    
}
