package ilmoitin;

import javafx.application.Application;
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

public class IlmoitinSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
       
        TextField input = new TextField("");
        Button btn = new Button("Päivitä");
        Label output = new Label("");
        
        btn.setOnAction((event) -> {
            output.setText(input.getText());
        });

        VBox komponenttiryhma = new VBox();
        komponenttiryhma.setSpacing(1);
        komponenttiryhma.getChildren().addAll(input, btn, output);

        Scene nakyma = new Scene(komponenttiryhma);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(IlmoitinSovellus.class);
    }

}
