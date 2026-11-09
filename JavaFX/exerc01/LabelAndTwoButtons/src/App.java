
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//Ator -> cenário (organizador) -> cena -> palco ---> mostra na tela

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override // Palco
    public void start(Stage mainStage) throws Exception {

        Label text = new Label("");

        // "Ator"
        Button button_confirm = new Button("OK");

        button_confirm.setOnAction(event -> {
            text.setText("Olá Mundo");;
        });

        Button button_clear = new Button("Limpar");

        button_clear.setOnAction(event -> {
            text.setText(""); // Define o texto como vazio para sumir
        });

        // Cenário base é organizador, quando cria a cena passa como parâmetro qual o
        // organizador (ex: StakePane, VBox, BorderPane, GridPane - tabela, etc)
        VBox baseScenario = new VBox();
        baseScenario.setAlignment(Pos.CENTER); //centraliza

        baseScenario.getChildren().addAll(text, button_confirm, button_clear); // adiciona o label e os botões no cenário

        // Cria a Cena e define o tamanho da janela (largura x altura)
        Scene scene = new Scene(baseScenario, 400, 300);

        // Monta o teatro (Palco)
        mainStage.setScene(scene);

        // Mostra a janela
        mainStage.show();
    }
}
