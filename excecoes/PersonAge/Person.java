package PersonAge;
/*4. Crie um programa que leia a idade de uma pessoa a partir de uma String, analise e trate conforme consta abaixo:
- Se a String for vazia, lance uma IllegalArgumentException, e informe [Erro de Entrada]: A idade não pode ser vazia;
- Se a String contiver letras ou símbolos, ou seja, se ela não contiver apenas números, trate como NumberFormatException e informe [Erro de Formato]: Digite apenas números inteiros; Dica: utilize Integer.parseInt() para a conversão de tipos.
- Se a idade for menor que 1 ou maior que 150, lance uma RuntimeException e informe [Erro de Regra]: Idade fora do intervalo permitido (1 a 150);

11/08/2026
*/

public class Person {
    
    int age;

    public void validateAge(String ageString){

        if (ageString.isEmpty()) {
            
            throw new 
        }
    }



}
