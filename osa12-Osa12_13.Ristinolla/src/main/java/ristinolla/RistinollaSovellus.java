package ristinolla;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class RistinollaSovellus extends Application {

    @Override
    public void start(Stage ikkuna) throws Exception {
        Pelinakyma pelinakyma = new Pelinakyma();

        // 3. Luodaan päätason asettelu
        BorderPane asettelu = new BorderPane();

        asettelu.setCenter(pelinakyma.getNakyma());
        
        
        // 6. Luodaan päänäkymä ja asetetaan päätason asettelu siihen
        Scene nakyma = new Scene(asettelu, 400, 300);
        
        
        
        

        // 7. Näytetään sovellus
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
    
    public static void main(String[] args) {
        launch(RistinollaSovellus.class);
    }
    

}
