package windows;

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.geometry.Rectangle2D;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class VentanaJavaFX extends Application {
    //componentes
    Image image;
    Pane root;
    ImageView imageView;
    //Button create;
    Button cancel;
    Button export;
    Button apply;
    //textos
    Text textGalicia;
    Text textAsturias;
    Text textCantabria;
    Text textPaisVasco;
    Text textNavarra;
    Text textLaRioja;
    Text textCastillaLeon;
    Text textAragon;
    Text textCatalunia;
    Text textMadrid;
    Text textCastillaLaMancha;
    Text textValencia;
    Text textBaleares;
    Text textMurcia;
    Text textExtremadura;
    Text textAndalucia;
    Text textCeuta;
    Text textMelilla;
    Text textCanarias;
    Text textTitleGalicia;
    Text textTitleAsturias;
    Text textTitleCantabria;
    Text textTitlePaisVasco;
    Text textTitleNavarra;
    Text textTitleLaRioja;
    Text textTitleCastillaLeon;
    Text textTitleAragon;
    Text textTitleCatalunia;
    Text textTitleMadrid;
    Text textTitleCastillaLaMancha;
    Text textTitleValencia;
    Text textTitleBaleares;
    Text textTitleMurcia;
    Text textTitleExtremadura;
    Text textTitleAndalucia;
    Text textTitleCeuta;
    Text textTitleMelilla;
    Text textTitleCanarias;
    TextField fieldGalicia;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ejemplo de JavaFX");//Título
        ini();

        //Coloco en su sitio
        imageView.setX(50);
        imageView.setY(50);
        export.setLayoutX(700);
        export.setLayoutY(870);
        //create.setLayoutX(200);
        //create.setLayoutY(870);
        cancel.setLayoutX(400);
        cancel.setLayoutY(870);
        apply.setLayoutX(800);
        apply.setLayoutY(870);
        cancel.setPrefSize(200,40);

        //fincionalidad botones
        cancel.setOnAction(e -> {System.exit(0);});
        export.setOnAction(e -> {exportImageWithText(root,"./images/export.png");});
        apply.setOnAction(e -> {applyToText();});
        //configuracion textos
        textGalicia.setTranslateX(370);    // Posición X del texto
        textGalicia.setTranslateY(175);    // Posición Y del texto
        textGalicia.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        textGalicia.setFill(Color.BLACK);  // Color del texto
        textGalicia.setTextAlignment(TextAlignment.CENTER);

        textAsturias.setTranslateX(460);    // Posición X del texto
        textAsturias.setTranslateY(150);    // Posición Y del texto
        textAsturias.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        textAsturias.setFill(Color.BLACK);  // Color del texto
        textAsturias.setTextAlignment(TextAlignment.CENTER);

        textCantabria.setTranslateX(560);    // Posición X del texto
        textCantabria.setTranslateY(160);    // Posición Y del texto
        textCantabria.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        textCantabria.setFill(Color.BLACK);  // Color del texto
        textCantabria.setTextAlignment(TextAlignment.CENTER);

        textPaisVasco.setTranslateX(640);    // Posición X del texto
        textPaisVasco.setTranslateY(170);    // Posición Y del texto
        textPaisVasco.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        textPaisVasco.setFill(Color.BLACK);  // Color del texto
        textPaisVasco.setTextAlignment(TextAlignment.CENTER);

        textNavarra.setTranslateX(682);    // Posición X del texto
        textNavarra.setTranslateY(200);    // Posición Y del texto
        textNavarra.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        textNavarra.setFill(Color.BLACK);  // Color del texto
        textNavarra.setTextAlignment(TextAlignment.CENTER);

        textLaRioja.setTranslateX(640);    // Posición X del texto
        textLaRioja.setTranslateY(225);    // Posición Y del texto
        textLaRioja.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        textLaRioja.setFill(Color.BLACK);  // Color del texto
        textLaRioja.setTextAlignment(TextAlignment.CENTER);

        textAragon.setTranslateX(740);    // Posición X del texto
        textAragon.setTranslateY(280);    // Posición Y del texto
        textAragon.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        textAragon.setFill(Color.BLACK);  // Color del texto
        textAragon.setTextAlignment(TextAlignment.CENTER);

        textCatalunia.setTranslateX(860);    // Posición X del texto
        textCatalunia.setTranslateY(255);    // Posición Y del texto
        textCatalunia.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        textCatalunia.setFill(Color.BLACK);  // Color del texto
        textCatalunia.setTextAlignment(TextAlignment.CENTER);

        textCastillaLeon.setTranslateX(520);    // Posición X del texto
        textCastillaLeon.setTranslateY(265);    // Posición Y del texto
        textCastillaLeon.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        textCastillaLeon.setFill(Color.BLACK);  // Color del texto
        textCastillaLeon.setTextAlignment(TextAlignment.CENTER);

        textMadrid.setTranslateX(580);    // Posición X del texto
        textMadrid.setTranslateY(350);    // Posición Y del texto
        textMadrid.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        textMadrid.setFill(Color.BLACK);  // Color del texto
        textMadrid.setTextAlignment(TextAlignment.CENTER);

        textCastillaLaMancha.setTranslateX(610);    // Posición X del texto
        textCastillaLaMancha.setTranslateY(425);    // Posición Y del texto
        textCastillaLaMancha.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        textCastillaLaMancha.setFill(Color.BLACK);  // Color del texto
        textCastillaLaMancha.setTextAlignment(TextAlignment.CENTER);

        textValencia.setTranslateX(740);    // Posición X del texto
        textValencia.setTranslateY(425);    // Posición Y del texto
        textValencia.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        textValencia.setFill(Color.BLACK);  // Color del texto
        textValencia.setTextAlignment(TextAlignment.CENTER);

        textBaleares.setTranslateX(945);    // Posición X del texto
        textBaleares.setTranslateY(400);    // Posición Y del texto
        textBaleares.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        textBaleares.setFill(Color.BLACK);  // Color del texto
        textBaleares.setTextAlignment(TextAlignment.CENTER);

        textMurcia.setTranslateX(710);    // Posición X del texto
        textMurcia.setTranslateY(530);    // Posición Y del texto
        textMurcia.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        textMurcia.setFill(Color.BLACK);  // Color del texto
        textMurcia.setTextAlignment(TextAlignment.CENTER);

        textExtremadura.setTranslateX(445);    // Posición X del texto
        textExtremadura.setTranslateY(440);    // Posición Y del texto
        textExtremadura.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        textExtremadura.setFill(Color.BLACK);  // Color del texto
        textExtremadura.setTextAlignment(TextAlignment.CENTER);

        textAndalucia.setTranslateX(550);    // Posición X del texto
        textAndalucia.setTranslateY(575);    // Posición Y del texto
        textAndalucia.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        textAndalucia.setFill(Color.BLACK);  // Color del texto
        textAndalucia.setTextAlignment(TextAlignment.CENTER);

        textCanarias.setTranslateX(275);    // Posición X del texto
        textCanarias.setTranslateY(680);    // Posición Y del texto
        textCanarias.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        textCanarias.setFill(Color.BLACK);  // Color del texto
        textCanarias.setTextAlignment(TextAlignment.CENTER);

        textCeuta.setTranslateX(460);    // Posición X del texto
        textCeuta.setTranslateY(690);    // Posición Y del texto
        textCeuta.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        textCeuta.setFill(Color.BLACK);  // Color del texto
        textCeuta.setTextAlignment(TextAlignment.CENTER);

        textMelilla.setTranslateX(600);    // Posición X del texto
        textMelilla.setTranslateY(710);    // Posición Y del texto
        textMelilla.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        textMelilla.setFill(Color.BLACK);  // Color del texto
        textMelilla.setTextAlignment(TextAlignment.CENTER);

        textTitleGalicia.setTranslateX(1200);
        textTitleGalicia.setTranslateY(30);
        textTitleAsturias.setTranslateX(1200);
        textTitleAsturias.setTranslateY(30);
        textTitleCantabria.setTranslateX(1200);
        textTitleCantabria.setTranslateY(30);
        textTitlePaisVasco.setTranslateX(1200);
        textTitlePaisVasco.setTranslateY(30);
        textTitleNavarra.setTranslateX(1200);
        textTitleNavarra.setTranslateY(30);
        textTitleLaRioja.setTranslateX(1200);
        textTitleLaRioja.setTranslateY(30);
        textTitleAragon.setTranslateX(1200);
        textTitleAragon.setTranslateY(30);
        textTitleCatalunia.setTranslateX(1200);
        textTitleCatalunia.setTranslateY(30);
        textTitleCastillaLaMancha.setTranslateX(1200);
        textTitleCastillaLaMancha.setTranslateY(30);
        textTitleCastillaLeon.setTranslateX(1200);
        textTitleCastillaLeon.setTranslateY(30);
        textTitleMadrid.setTranslateX(1200);
        textTitleMadrid.setTranslateY(30);
        textTitleValencia.setTranslateX(1200);
        textTitleValencia.setTranslateY(30);
        textTitleBaleares.setTranslateX(1200);
        textTitleBaleares.setTranslateY(30);
        textTitleMurcia.setTranslateX(1200);
        textTitleMurcia.setTranslateY(30);
        textTitleExtremadura.setTranslateX(1200);
        textTitleExtremadura.setTranslateY(30);
        textTitleAndalucia.setTranslateX(1200);
        textTitleAndalucia.setTranslateY(30);
        textTitleCanarias.setTranslateX(1200);
        textTitleCanarias.setTranslateY(30);
        textTitleCeuta.setTranslateX(1200);
        textTitleCeuta.setTranslateY(30);
        textTitleMelilla.setTranslateX(1200);
        textTitleMelilla.setTranslateY(30);

        fieldGalicia.setTranslateX(1300);
        fieldGalicia.setTranslateY(30);

        root.getChildren().add(imageView); // Agregar al contenedor
        root.getChildren().add(cancel);
        //root.getChildren().add(create);
        root.getChildren().add(export);
        root.getChildren().add(apply);
        root.getChildren().add(textGalicia);
        root.getChildren().add(textTitleGalicia);
        root.getChildren().add(fieldGalicia);
        root.getChildren().add(textAsturias);
        root.getChildren().add(textCantabria);
        root.getChildren().add(textPaisVasco);
        root.getChildren().add(textNavarra);
        root.getChildren().add(textLaRioja);
        root.getChildren().add(textAragon);
        root.getChildren().add(textCatalunia);
        root.getChildren().add(textCastillaLeon);
        root.getChildren().add(textMadrid);
        root.getChildren().add(textCastillaLaMancha);
        root.getChildren().add(textValencia);
        root.getChildren().add(textBaleares);
        root.getChildren().add(textMurcia);
        root.getChildren().add(textExtremadura);
        root.getChildren().add(textAndalucia);
        root.getChildren().add(textCanarias);
        root.getChildren().add(textCeuta);
        root.getChildren().add(textMelilla);
        root.getChildren().add(textTitleAsturias);
        root.getChildren().add(textTitleCantabria);
        root.getChildren().add(textTitlePaisVasco);
        root.getChildren().add(textTitleNavarra);
        root.getChildren().add(textTitleLaRioja);
        root.getChildren().add(textTitleCastillaLeon);
        root.getChildren().add(textTitleAragon);
        root.getChildren().add(textTitleCatalunia);
        root.getChildren().add(textTitleMadrid);
        root.getChildren().add(textTitleCastillaLaMancha);
        root.getChildren().add(textTitleValencia);
        root.getChildren().add(textTitleBaleares);
        root.getChildren().add(textTitleMurcia);
        root.getChildren().add(textTitleExtremadura);
        root.getChildren().add(textTitleAndalucia);
        root.getChildren().add(textTitleCeuta);
        root.getChildren().add(textTitleMelilla);
        root.getChildren().add(textTitleCanarias);

        Scene scene = new Scene(root, 1800, 920);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void applyToText() {
        textGalicia.setText(fieldGalicia.getText());
    }

    private void ini() {
        root = new Pane();  // Utilizamos un Pane como contenedor

        // Cargar una imagen desde un archivo (asegúrate de que la ruta sea correcta)
        image = new Image("file:./images/mapaRedimensionado.png");

        // Crear un ImageView para mostrar la imagen
        imageView = new ImageView(image);
        // Botones de aceptar y cancelar
        //create = new Button("Crear");
        cancel = new Button("Salir");
        export = new Button("Exportar");
        apply = new Button("Aplicar");
        // Textos
        textGalicia = new Text("Galicia");
        textAsturias = new Text("Asturias");
        textCantabria = new Text("Cantabria");
        textPaisVasco = new Text("PaisVasco");
        textNavarra = new Text("Navarra");
        textLaRioja = new Text("LaRioja");
        textAragon = new Text("Aragon");
        textCatalunia = new Text("Cataluña");
        textCastillaLeon = new Text("CastillaYLeon");
        textMadrid = new Text("Madrid");
        textCastillaLaMancha = new Text("CastillaLaMancha");
        textValencia = new Text("Valencia");
        textBaleares = new Text("Baleares");
        textCanarias = new Text("Canarias");
        textCeuta = new Text("Ceuta");
        textMelilla = new Text("Melilla");
        textMurcia = new Text("Murcia");
        textAndalucia = new Text("Andalucia");
        textExtremadura = new Text("Extremadura");

        textTitleGalicia = new Text("Introduce Galicia");
        textTitleAsturias = new Text("Introduce Asturias");
        textTitleCantabria = new Text("Introduce Cantabria");
        textTitlePaisVasco = new Text("Introduce PaisVasco");
        textTitleNavarra = new Text("Introduce Navarra");
        textTitleLaRioja = new Text("Introduce LaRioja");
        textTitleAragon = new Text("Introduce Aragon");
        textTitleCatalunia = new Text("Introduce Cataluña");
        textTitleCastillaLeon = new Text("CIntroduce astillaYLeon");
        textTitleMadrid = new Text("Introduce Madrid");
        textTitleCastillaLaMancha = new Text("Introduce CastillaLaMancha");
        textTitleValencia = new Text("Introduce Valencia");
        textTitleBaleares = new Text("Introduce Baleares");
        textTitleCanarias = new Text("Introduce Canarias");
        textTitleCeuta = new Text("Introduce Ceuta");
        textTitleMelilla = new Text("Introduce Melilla");
        textTitleMurcia = new Text("Introduce Murcia");
        textTitleAndalucia = new Text("Introduce Andalucia");
        textTitleExtremadura = new Text("Introduce Extremadura");

        fieldGalicia = new TextField();
    }

    public static void main(String[] args) {
        launch(args);
    }
    // Método para exportar la imagen con el texto superpuesto
    private static void exportImageWithText(Pane root, String filePath) {
        // creamos los parametros de captura
        SnapshotParameters params = new SnapshotParameters();
        //X e Y de donde empieza la captura , dimensiones de la captura
        params.setViewport(new Rectangle2D(50,50,1078,786));
        WritableImage writableImage = root.snapshot(params, null);
        File file = new File(filePath);
        try {
            ImageIO.write(SwingFXUtils.fromFXImage(writableImage, null), "png", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
