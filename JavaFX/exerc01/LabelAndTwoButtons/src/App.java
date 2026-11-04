

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//Ator -> cenário (organizador) -> cena -> palco ---> mostra na tela

public class App extends Application{
    public static void main(String[] args){
         launch(args);
    }

    @Override       //Palco
    public void start(Stage mainStage) throws Exception {
       
        //"Ator"
        Button button = new Button("OK");

        Label text = new Label("Olá Mundo");
      
        button.setOnAction(null);




        //Cenário base é organizador, quando cria a cena passa como parâmetro qual o organizador (ex: StakePane, VBox, BorderPane, GridPane, etc)
        VBox  baseScenario = new VBox();
        baseScenario.getChildren().add(button); //adciona o botão no cenário
    
        //Cria a Cena e define o tamanho da janela (largura x altura)
        Scene scene = new Scene(baseScenario, 400, 300);

        //Monta o teatro (Palco)
        mainStage.setScene(scene);

        //Mostra a janela
        mainStage.show();
    }
}

