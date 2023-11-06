package ventanas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class VentanaJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Configurar la ventana
        primaryStage.setTitle("Ejemplo de JavaFX");

        // Crear una etiqueta
        Label label = new Label("¡Hola, JavaFX!");

        // Crear un botón
        Button button = new Button("Haz clic");

        // Configurar el evento del botón
        button.setOnAction(e -> label.setText("¡Has hecho clic en el botón!"));

        // Crear un contenedor y agregar la etiqueta y el botón
        StackPane root = new StackPane();
        root.getChildren().addAll(label, button);

        // Crear la escena
        Scene scene = new Scene(root, 300, 200);

        // Configurar la escena en la ventana
        primaryStage.setScene(scene);

        // Mostrar la ventana
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
