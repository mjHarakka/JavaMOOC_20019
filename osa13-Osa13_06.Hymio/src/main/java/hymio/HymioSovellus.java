package hymio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;


public class HymioSovellus extends Application {

    public void start(Stage ikkuna) {
        Canvas piirtoalusta = new Canvas(800, 800);
        GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();
        ColorPicker varinValitsin = new ColorPicker(Color.BLACK);
        
        piirturi.setFill(varinValitsin.getValue());
        piirturi.fillRect(200, 100, 100, 100);
        piirturi.fillRect(500, 100, 100, 100);
        
        piirturi.fillRect(100, 400, 100, 100);
        piirturi.fillRect(600, 400, 100, 100);
        
        piirturi.fillRect(200, 500, 100, 100);
        piirturi.fillRect(300, 500, 100, 100);
        piirturi.fillRect(400, 500, 100, 100);
        piirturi.fillRect(500, 500, 100, 100);
    
        
        BorderPane asettelu = new BorderPane();
        asettelu.setCenter(piirtoalusta);
        
        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();
        
    }
    
    public static void main(String[] args) {
        launch(HymioSovellus.class);
    }

}
