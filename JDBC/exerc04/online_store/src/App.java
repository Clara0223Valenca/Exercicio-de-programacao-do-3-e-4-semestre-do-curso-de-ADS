public class App {
    public static void main(String[] args) throws Exception {
         
        Conexao con = new Conexao();

        con.conectar();
        System.out.println("Feito!!");

    }
}
