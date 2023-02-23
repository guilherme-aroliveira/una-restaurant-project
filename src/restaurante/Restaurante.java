/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: 
 */

package restaurante;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Restaurante extends Application{
    @Override
    public void start(Stage stage) throws Exception {
    //Herda os recursos da aplicação
    Parent root = FXMLLoader.load(getClass().getResource("SceneBuilder.fxml"));

    Scene scene = new Scene(root);

    stage.setScene(scene);
    stage.show();
    }

    //Execução do programa
    public static void main(String[] args) {
        launch(args);
    }
}
