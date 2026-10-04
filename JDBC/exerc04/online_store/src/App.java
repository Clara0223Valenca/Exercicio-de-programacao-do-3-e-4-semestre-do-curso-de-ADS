public class App {
    public static void main(String[] args) throws Exception {
         
       /*  ConnectionDB con = new ConnectionDB();

        con.connect();
        System.out.println("Feito!!"); */

        Sale online_store = new Sale();

        online_store.readSQLAndWriteCSV();

        online_store.readCSV();
    }
}
