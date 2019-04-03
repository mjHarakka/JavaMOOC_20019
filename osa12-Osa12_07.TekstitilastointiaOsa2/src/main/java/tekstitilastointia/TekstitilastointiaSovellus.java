package tekstitilastointia;


import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TekstitilastointiaSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {

        // Textfield
        TextArea input = new TextArea(""); 
        // Labels
        Label kirjaimiaLabel = new Label("Kirjaimia: ");
        Label sanojaLabel = new Label("Sanoja: ");
        Label pisinSanaLabel = new Label("Pisin sana on: ");
        
        input.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
            
            int merkkeja = uusiArvo.length();
            String[] palat = uusiArvo.split(" ");
            int sanoja = palat.length;
            String pisin = Arrays.stream(palat)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .get();

            kirjaimiaLabel.setText("Kirjaimia: " + merkkeja);
            sanojaLabel.setText("Sanoja: " + sanoja);
            pisinSanaLabel.setText("Pisin sana on: " + pisin);
        });

        BorderPane asettelu = new BorderPane();
        HBox tekstit = new HBox();
        tekstit.setSpacing(10);
        tekstit.getChildren().addAll(kirjaimiaLabel, sanojaLabel, pisinSanaLabel);
        asettelu.setBottom(tekstit);
 
        asettelu.setCenter(input);

        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }

}