package nappijatekstikentta;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class NappiJaTekstikenttaSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        TextField tekstikomponentti = new TextField("Tekstikenttä");
        Button painike = new Button("Push me!");

        FlowPane komponenttiryhma = new FlowPane();
        komponenttiryhma.getChildren().add(painike);
        komponenttiryhma.getChildren().add(tekstikomponentti);
        

        Scene nakyma = new Scene(komponenttiryhma);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
    
    public static void main(String[] args) {
        launch(NappiJaTekstikenttaSovellus.class);
    }

}
