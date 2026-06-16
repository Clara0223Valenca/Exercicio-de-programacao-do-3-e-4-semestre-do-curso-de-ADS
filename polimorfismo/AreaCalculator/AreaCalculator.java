package AreaCalculator;
/*3. (Sobrecarga) Um software de desenho técnico precisa calcular a área de diferentes formas geométricas, mas o usuário quer chamar sempre o mesmo nome de método, independentemente da figura. Assim, desenvolva o seguinte:
Crie uma classe chamada CalculadoraArea.
Implemente o método calcular de três formas diferentes (na mesma classe):
Para um Quadrado: recebe um único valor double (lado) e retorna a área (lado * lado).
Para um Retângulo: recebe dois valores double (base e altura) e retorna a área (base * altura).
Para um Círculo: recebe um valor double (raio) e um boolean indicando true (apenas para diferenciar a assinatura), retornando a área (  *raio² ). Dica: use Math.PI.
08/06/2026
 */
public class AreaCalculator {

    public double calculate(double side){

        return side * side;
    }
    
    public double calculate(double base, double height){
        
        return base * height;
    }

    public double calculate(double radius, boolean isTrue){

        return Math.PI * (radius * radius);
    }

}
