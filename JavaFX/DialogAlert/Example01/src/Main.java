import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	
	AlunoDAO aDAO = new AlunoDAO();
	TextField txtNome;
		// txtNome.setPromptText(D);
	TextField txtNota1 ;
	TextField txtNota2 ;
	TextField txtNota3 ;
	public static void main(String[] args) {
		launch(args);
		ConnectionDB conDB = new ConnectionDB();

	   conDB.connect();
        // // System.out.println("Feito!!");


		// Aluno aluno01 =  new Aluno("Maria", 10, 7, 5);

        // aDAO.Inserir(aluno01);
	}

	@Override
	public void start(Stage palco) throws Exception {
		

		
		Label nome = new Label("Informe o nome do aluno: ");
		Label nota1 = new Label("Informe a 1° nota: ");
		Label nota2 = new Label("Informe a 2° nota: ");
		Label nota3 = new Label("Informe a 3° nota: ");
		txtNome= new TextField();
		// txtNome.setPromptText(D);
		txtNota1 = new TextField();
		txtNota2 = new TextField();
		txtNota3 = new TextField();

		Button btnSalvar = new Button("Salvar");


		
		btnSalvar.setOnAction(evento->{
			try {
			String nm = txtNome.toString();
			double n1 = Double.parseDouble(txtNota1.getText());
			double n2 = Double.parseDouble(txtNota2.getText());
			double n3 = Double.parseDouble(txtNota3.getText());
			 
			salvarAluno(nm, n1, n2, n3);
			limparCampos();
			sucesso();
			}catch (Exception e) {
			falha(e.getMessage());
		}
		});

		
		
		VBox painelV = new VBox(10);
		painelV.setAlignment(Pos.CENTER);
		
		/* Padding interno (padding):
		 * Define o espaçamento das bordas internas do próprio VBox. 
		 */
		painelV.setPadding(new Insets(20));
		
		painelV.getChildren().addAll(nome,txtNome, nota1, txtNota1, nota2, txtNota2, nota3, txtNota3, btnSalvar);
		
		palco.setScene(new Scene(painelV, 450, 300));
		palco.show();
	
	}
	
	private void limparCampos(){
	
			txtNome.setText("");
			txtNota1.setText("");
			txtNota2.setText("");
			txtNota3.setText("");		
	}

	private void sucesso() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Cadastro");
		alert.setHeaderText("Sucesso");
		alert.setContentText("Cadastro de usuário bem sucedido.");
		alert.show();
	}
	
	private void falha(String msg) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Cadastro");
		alert.setHeaderText("Falha ao cadastrar usuário");
		alert.setContentText(msg);
		alert.show();
	}

	private void salvarAluno(String nome, double nt1,double nt2, double nt3 ) {
		Aluno aln = new Aluno(nome, nt1, nt2, nt3);
		
		aDAO.Inserir(aln);

	}

	
}