/*2. Dando prosseguimento ao exercício anterior, desenvolva o que é pedido a seguir: Crie uma subclasse de Pessoa, chamada Funcionario. A classe Funcionario deve ter os atributos matricula e salario. Considere a seguinte regra no método modificador setSalario: este deve atribuir ao atributo salário o valor recebido como parâmetro desde que este valor não seja negativo. Caso seja negativo, não faz nada. Todo funcionário recebe seu salário em duas parcelas, sendo 60% na primeira parcela e 40% na segunda parcela. Assim, escreva os métodos: getSalarioPrimeiraParcela() que retorna o valor da primeira parcela do salário (60%); getSalarioSegundaParcela() que retorna o valor da segunda parcela do salário (40%). Não esqueça de definir as visibilidades adequadas para cada atributo/método.
27/04/2026*/

public class Employee extends Person {

    private int matriculation;
    private double salary;

    Employee(String name, String gender, int age) {
        super(name, gender, age);

    }

    public void setSalary(double salary) {

        if (salary > 0)
            this.salary = salary;
    }

    // retorna 60% do salário
    public double getSalarioPrimeiraParcela(){

        return salary * 0.6;
    }


    // retorna 40% do salário
    public double getSalarioSegundaParcela(){

        return salary * 0.4;
    }

    public int getMatriculation() {
        return matriculation;
    }
}
