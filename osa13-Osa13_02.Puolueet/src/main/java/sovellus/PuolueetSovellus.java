package sovellus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PuolueetSovellus extends Application {
    
    @Override
    public void start(Stage ikkuna) {
        
        ArrayList<XYChart.Series> lista = new ArrayList<>();
        
        NumberAxis xAkseli = new NumberAxis(1968, 2008, 4);
        NumberAxis yAkseli = new NumberAxis(0, 30, 5);
 
        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setTitle("Puolueiden suhteellinen kannatus");
        viivakaavio.setLegendVisible(true);
        
        ArrayList<String[]> rivit = new ArrayList<>();
        
        try (Scanner fileReader = new Scanner(new File("puoluedata.tsv"))) {
     
            while(fileReader.hasNextLine()) {
                rivit.add(fileReader.nextLine().split("\\s+"));
            }
            
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
        for (String[] rivi: rivit) {
            System.out.println(rivi[0]);
        }
        
        for (int i = 0; i < rivit.size(); i++) {
            String[] rivi = rivit.get(i);
            
            if (i > 0) {
                lista.add(new XYChart.Series());
                lista.get(i-1).setName(rivi[0]);
                int year = 1968;
                for (int j = 1; j < rivi.length; j++) {
                    
                    double data = 0.0;
                    
                    if (rivi[j].equals("-")) {
                        data = 0.0;
                    } else {
                        data = Double.valueOf(rivi[j]);
                    }

                    lista.get(i-1).getData().add(new XYChart.Data(year, data));
                    year += 4;
                   
                    
                }
                viivakaavio.getData().add(lista.get(i-1));
            }

        }

        Scene nakyma = new Scene(viivakaavio, 400, 300);
        ikkuna.setScene(nakyma);
        ikkuna.show();

    }
    
    public static void main(String[] args) {
        launch(PuolueetSovellus.class);
    }

}
