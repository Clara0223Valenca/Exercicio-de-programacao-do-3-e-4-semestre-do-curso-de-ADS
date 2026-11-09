import java.util.Optional;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage palco) throws Exception {
		
		VBox painelV = new VBox(10);
		painelV.setAlignment(Pos.CENTER);
		palco.setScene(new Scene(painelV, 300, 300));
		palco.show();
		
		Button b1 = new Button("Simples");
		Button b2 = new Button("Informação");
		Button b3 = new Button("Aviso");
		Button b4 = new Button("Erro");
		Button b5 = new Button("Confirmação");
		
		painelV.getChildren().addAll(b1,b2,b3,b4,b5);
		
		b1.setOnAction(evento->{mostrarSimplesAlert();});
		b2.setOnAction(evento->{mostrarInformacaoAlert();});
		b3.setOnAction(evento->{mostrarAvisoAlert();});
		b4.setOnAction(evento->{mostrarErroAlert();});
		b5.setOnAction(evento->{mostrarConfirmacaoAlert();});
		
	}
	
	private void mostrarSimplesAlert() {
		Alert alert = new Alert(AlertType.NONE);
		alert.setTitle("Alerta Simples");
		alert.setHeaderText("Demonstração");
		alert.setContentText("Essa é a minha mensagem.");
		alert.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
		alert.show();
	}
	
	private void mostrarInformacaoAlert() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Teste de Conexão");
		alert.setHeaderText("Resultado");
		alert.setContentText("Conexão ao banco de dados realizada com sucesso.");
		alert.show();
	}
	
	private void mostrarAvisoAlert() {
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("Alerta");
		alert.setHeaderText("Status da Bateria");
		alert.setContentText("A carga da bateria está baixa!");
		alert.show();
	}
	
	private void mostrarErroAlert() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Erro");
		alert.setHeaderText("Falha ao adicionar usuário");
		alert.setContentText("O usuário já existe!");
		alert.show();
	}
	
	private void mostrarConfirmacaoAlert() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Deletar");
		alert.setHeaderText("Deletar Arquivo");
		alert.setContentText("Você tem certeza que quer deletar o arquivo?");
		Optional<ButtonType> resposta = alert.showAndWait();
		if(resposta.get() == ButtonType.OK) {
			System.out.println("Arquivo deletado com sucesso.");
		} else if(resposta.get() == ButtonType.CANCEL){
			System.out.println("Cancelado");
		}
	}
	
}