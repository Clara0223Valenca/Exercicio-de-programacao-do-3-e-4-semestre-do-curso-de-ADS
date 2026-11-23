import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage stg) throws Exception {
        
        Parent homeScreen =  FXMLLoader.load(getClass().getResource("tela_cadastro.fxml"));

        Scene scene = new Scene(homeScreen);

        stg.setScene(scene);
        stg.setTitle("Tela de cadastro");
        stg.show();
        
    }
}
