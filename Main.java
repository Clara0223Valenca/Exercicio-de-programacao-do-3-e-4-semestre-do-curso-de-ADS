public class Main {

    
    public static void main(String[] args) {

        Dates date1 = new Dates(01, 02, 2028);

        date1.displayDate();

        date1.nextDay();

        date1.displayDate();

        System.out.println();

        Dates date2 = new Dates(31, 12, 2028);

        date2.displayDate();

        date2.nextDay();

        date2.displayDate();

        System.out.println();
        
        Dates date3 = new Dates(31, 02, 2028);

        date3.displayDate();

        date3.nextDay();

        date3.displayDate();
        

    }
    
}
