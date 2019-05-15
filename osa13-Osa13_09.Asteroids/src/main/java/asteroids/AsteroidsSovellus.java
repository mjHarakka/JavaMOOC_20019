package asteroids;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AsteroidsSovellus extends Application {

    public static int LEVEYS = 300;
    public static int KORKEUS = 200;
    
    @Override
    public void start(Stage stage) throws Exception {        
        Pane ruutu = new Pane();
        ruutu.setPrefSize(LEVEYS, KORKEUS);

        Alus alus = new Alus(LEVEYS / 2, KORKEUS / 2);
        List<Asteroidi> asteroidit = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random rnd = new Random();
            Asteroidi asteroidi = new Asteroidi(rnd.nextInt(LEVEYS / 3), rnd.nextInt(KORKEUS));
            asteroidit.add(asteroidi);
        }

        ruutu.getChildren().add(alus.getHahmo());
        asteroidit.forEach(asteroidi -> ruutu.getChildren().add(asteroidi.getHahmo()));

        Scene scene = new Scene(ruutu);
        
        Map<KeyCode, Boolean> painetutNapit = new HashMap<>();

        scene.setOnKeyPressed(event -> {
            painetutNapit.put(event.getCode(), Boolean.TRUE);
        });

        scene.setOnKeyReleased(event -> {
            painetutNapit.put(event.getCode(), Boolean.FALSE);
        });
        
        new AnimationTimer() {

            @Override
            public void handle(long nykyhetki) {
                if(painetutNapit.getOrDefault(KeyCode.LEFT, false)) {
                    alus.kaannaVasemmalle();
                }

                if(painetutNapit.getOrDefault(KeyCode.RIGHT, false)) {
                    alus.kaannaOikealle();
                }

                if(painetutNapit.getOrDefault(KeyCode.UP, false)) {
                    alus.kiihdyta();
                }

                alus.liiku();
                asteroidit.forEach(asteroidi -> asteroidi.liiku());

                asteroidit.forEach(asteroidi -> {
                    if (alus.tormaa(asteroidi)) {
                        stop();
                    }
                });
            }
        }.start();
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static int osiaToteutettu() {
        return 0;
    }

}
