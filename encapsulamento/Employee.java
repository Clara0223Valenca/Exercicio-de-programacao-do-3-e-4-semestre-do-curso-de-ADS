/* 7. A fim de representar empregados em uma firma, crie uma classe chamada Empregado que inclui as três informações a seguir como atributos: um primeiro nome, um sobrenome, um salário mensal. Sua classe deve ter um construtor que inicializa os três atributos. Forneça um método set e get para cada atributo. Se o salário mensal não for positivo, configure-o como 0 (zero). Crie um método que exibe o salário anual e um que dê 10% de aumento no salário.
09/04/2026 */
package encapsulamento;

public class Employee {
    
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary){

        this.firstName = firstName; 
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
        
    }

    public String getFirstName(){

        return firstName;
    }

    public void setFirstName(String firstName){

        this.firstName = firstName;
    }

    public String getLastName(){

        return lastName;
    }

    public void setLastName(String lastName){

        this.lastName = lastName;
    }

    public double getMonthlySalary(){

        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary){

        this.monthlySalary = monthlySalary;
    }



    
}