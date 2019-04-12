package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.util.Arrays;
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


public class UseampiNakyma extends Application {

    @Override
    public void start(Stage ikkuna) {

        Button ekaan = new Button("Ekaan näkymään!");
        Button tokaan = new Button("Tokaan näkymään!");
        Button kolmanteen = new Button("Kolmanteen näkymään!");
        
        BorderPane ekaNakyma = new BorderPane();
        VBox tokaNakyma = new VBox();
        GridPane kolmasNakyma = new GridPane();
        
        ekaNakyma.setTop(new Label("Eka näkymä!"));
        ekaNakyma.setCenter(tokaan);
    
        tokaNakyma.getChildren().addAll(kolmanteen, new Label("Toka näkymä!"));
        kolmasNakyma.add(new Label("Kolmas näkymä!"), 0, 0);
        kolmasNakyma.add(ekaan, 1, 1);
        
        Scene eka = new Scene(ekaNakyma);
        Scene toka = new Scene(tokaNakyma);
        Scene kolmas = new Scene(kolmasNakyma);
       
        tokaan.setOnAction((event) -> {
            ikkuna.setScene(toka);
        });
        
        kolmanteen.setOnAction((event) -> {
            ikkuna.setScene(kolmas);
        });
        
        ekaan.setOnAction((event) -> {
            ikkuna.setScene(eka);
        });
        
        ikkuna.setScene(eka);
        ikkuna.show();
    }
    
    public static void main(String[] args) {
        launch(UseampiNakyma.class);
    }

}
