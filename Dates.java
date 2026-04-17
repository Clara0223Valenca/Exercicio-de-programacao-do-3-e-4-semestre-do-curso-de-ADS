/* Crie uma classe para representar datas. Represente uma data usando três atributos: o dia, o mês, e o ano. Sua classe deve ter um método construtor que inicializa os três atributos e verifica a validade do dia e mês. Desenvolva os seguinte métodos: um método exibirData para retornar uma representação da data formatada mostrando o dia, o mês e o ano separados por barra (/); um método para avançar uma data para o dia seguinte. Para esta atividade, não utilize nenhuma classe nativa para cálculo de datas e ignore a existência de anos bissextos. 
16/04/2026 */

public class Dates {

    private int day;
    private int month;
    private int year;

    int lastMonth;

    public Dates(int day, int month, int year) {

        if (verifyDayAndMonth(day, month) && verifyMonth(month)) {

            this.day = day;
            this.month = month;
            this.year = year;

        } else {

            System.out.println("Data inválida tente novamente ");

        }
    }

    private boolean verifyMonth(int month) {

        if (month >= 1 || month <= 12) {

            return true;
        } else {

            return false;
        }
    }

    public boolean verifyDayAndMonth(int day, int month) {

        int[] month31 = { 1, 3, 5, 7, 8, 10, 12 };

        for (int months : month31) {

            if (month == months && (day > 0 && day <= 31)) {

                lastMonth = 31;
                return true;

            }
        }

        int[] month30 = { 4, 6, 9, 11 };

        for (int months : month30) {

            if (month == months && (day > 0 && day <= 30)) {

                lastMonth = 30;
                return true;
            }
        }

        if (month == 2 && (day > 0 && day <= 28)) {

            lastMonth = 28;
            return true;
        }

        return false;

    }

    public void displayDate() {

        if (day == 0) {

            System.out.println("Data inválida");

        } else {
            System.out.println(day + "/" + month + "/" + year);

        }
    }

    public void nextDay() {

        if (day == 0) {

            System.out.println("Data inválida");

        } else {
            if (day == lastMonth) {

                if (month == 12) {
                    this.month = 1;
                    this.day = 1;
                    this.year += 1;
                } else {
                    this.day = 1;
                    this.month = month + 1;
                }
            } else {

                this.day = day + 1;
            }
        }

    }

}