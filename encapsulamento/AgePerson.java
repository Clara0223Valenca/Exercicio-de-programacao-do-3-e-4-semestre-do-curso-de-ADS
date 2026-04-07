/*2. Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não. Instancie e realize testes.
19/03/2026 */

public class AgePerson {
    
    private String nome;
    private int idade;

    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }
    
    public int getAge() {
        return idade;
    }

    public void setAge(int idade) {
        this.idade = idade;
    }

    
    public boolean checkAge(){

        if(idade >= 18){

            return true;
        } else {

            return false;
        }
        
    }

}
