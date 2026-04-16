public class Main {
    
    public static void main(String[] args) {
        
        // BankAccount account1 = new BankAccount();
        // AgePerson person1 = new AgePerson();
        // Book book1 = new Book();

        // //BankAccount 
        // account1.holder = "Clara Valença";
        // account1.setAccountNumber(12345678);
        // account1.setBalance(100000.50);

        // System.out.println("Cliente " + account1.holder + " com saldo " +  account1.getBalance() + " e número de conta " + account1.getAccountNumber());


        // //AgePerson
        // person1.setName("João Fernando");
        // person1.setAge(25);
        
        // if(person1.checkAge()) {

        //     System.out.println(person1.getName() + " é maior de idade");
        // } else {

        //     System.out.println(person1.getName() + " é menor de idade");
        // }


        // //Book 
        // book1.setTitulo("Iracema");
        // book1.setAutor("José de Alencar");
        // book1.exibirDetalhes();

        // //Counter 
        // Counter eventCounter = new Counter();

        // eventCounter.increase();
        // System.out.println(eventCounter.getValue());

        // eventCounter.reset();
        // System.out.println(eventCounter.getValue());

        // eventCounter.setValue(5);
        // System.out.println("O número de eventos registrado no contador é: " + eventCounter.getValue());

        
        Employee employee1 = new Employee("José", "Calvalcante", 1800.0);

        System.out.println("O funcionário " + employee1.getFirstName() + " " + employee1.getLastName() + " recebe mensalmente R$" + employee1.getMonthlySalary());

        employee1.annualSalary();

        employee1.tenPercentIncrease();

        System.out.print("Agora o salário mensal  é" + employee1.getMonthlySalary() + " e o salário anual é ");
        employee1.annualSalary();


    }
}
