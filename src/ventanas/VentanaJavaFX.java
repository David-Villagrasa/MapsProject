package ventanas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class VentanaJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ejemplo de JavaFX");

        Pane root = new Pane();  // Utilizamos un Pane como contenedor

        // Crear un botón y establecer su posición
        Button button1 = new Button("Botón 1");
        button1.setLayoutX(100); // Posición X
        button1.setLayoutY(50);  // Posición Y

        Button button2 = new Button("Botón 2");
        button2.setLayoutX(200);
        button2.setLayoutY(100);


        root.getChildren().addAll(button1, button2);

        Scene scene = new Scene(root, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
