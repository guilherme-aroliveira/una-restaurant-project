package restaurante;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    //Identificação dos controles 
    @FXML
    private TextField txtField;

    @FXML
    private Button submitBtn;

    @FXML
    private Label display;

    //Criação dos eventos
    @FXML
    private void onSubmitBtnClick(ActionEvent event) {
        display.setText(txtField.getText());
    }
}
