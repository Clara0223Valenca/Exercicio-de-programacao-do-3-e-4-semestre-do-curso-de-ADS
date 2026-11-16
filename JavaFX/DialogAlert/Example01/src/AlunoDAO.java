import java.sql.Connection;
import java.sql.PreparedStatement;


public class AlunoDAO {
    
    private ConnectionDB connectionDB = new ConnectionDB();

    //cadastrar
    //  public void Inserir(String nome, double nota1, double nota2, double nota3){
    public void Inserir(Aluno aluno){
        
        String sql = "INSERT INTO alunos(nome, nota1, nota2, nota3) " + "VALUES (?, ?, ?, ?)";
                                                                      //1 //2
        try {

                // Validação do nome do aluno
            if (aluno.getNome() == null || aluno.getNome().isEmpty()) {

                throw new Exception("O nome do aluno não pode estar vazio.");
            }
            
                // Validação das notas
            if (aluno.getNota1() > 10 || aluno.getNota1() < 0) {

                throw new Exception("A nota deve estar entre 0 e 10");
            }

            if (aluno.getNota2() > 10 || aluno.getNota2() < 0) {

                throw new Exception("A nota deve estar entre 0 e 10");
            }

            if (aluno.getNota3() > 10 || aluno.getNota3() < 0) {

                throw new Exception("A nota deve estar entre 0 e 10");
            }
            
            Connection conDB = connectionDB.connect();
            PreparedStatement ps = conDB.prepareStatement(sql);

            ps.setString(1, aluno.getNome());
            ps.setDouble(2, aluno.getNota1());
            ps.setDouble(3, aluno.getNota2());
            ps.setDouble(4, aluno.getNota3());
            ps.execute();

            System.out.println("Aluno Cadastrado");

            
        } catch (Exception e) {
            
            
            System.out.println("Cadastro de aluno falhou.");
        }
    }

}
