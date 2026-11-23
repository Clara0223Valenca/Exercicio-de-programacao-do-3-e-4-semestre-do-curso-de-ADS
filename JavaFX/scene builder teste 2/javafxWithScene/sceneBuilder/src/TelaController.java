//view > Show Sample Controller Skeleton
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class TelaController {

    @FXML
    private Button btn_limpar;

    @FXML
    private Button btn_ok;

    @FXML
    private TextField txtNome;

    @FXML
    void exibeMensagem(ActionEvent event) {

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Mensagem");
        alert.setHeaderText("Boas Vindas");
        alert.setContentText("Bem vindo(a) " + txtNome.getText()+"!");
        alert.show();
    }

    @FXML
    void limparCampo(ActionEvent event) {

        txtNome.clear();
    }

}
