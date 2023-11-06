package windows;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class VentanaJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ejemplo de JavaFX");
        Pane root = new Pane();  // Utilizamos un Pane como contenedor

        // Cargar una imagen desde un archivo (asegúrate de que la ruta sea correcta)
        Image image = new Image("file:./images/mapaRedimensionado.png");

        // Crear un ImageView para mostrar la imagen
        ImageView imageView = new ImageView(image);

        imageView.setX(50);
        imageView.setY(50);



        root.getChildren().add(imageView); // Agregar el ImageView al contenedor

        Scene scene = new Scene(root, 1800, 920);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
