
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lukutaitovertailu {
    
    public static void main(String[] args) {
        
    List<Maa> maat = lueKirjat("lukutaito.csv");
        
        
    
        maat.stream()
                .sorted((m1, m2) -> {
                return Double.compare(m1.getLkPros(), m2.getLkPros());
                })
                .forEach(m -> System.out.println(m));
        
    }

    public static List<Maa> lueKirjat(String tiedosto) {

        List <Maa> kirjat = new ArrayList<>();
        
        try {
            
            Files.lines(Paths.get(tiedosto))
                    .map(rivi -> rivi.split(","))
                    .map(rivi -> new Maa(rivi[3],
                            Integer.valueOf(rivi[4]),
                            rivi[2].replace("(%)", "").trim(),
                            Double.valueOf(rivi[5])))
                    .collect(Collectors.toCollection(ArrayList::new))
                    .forEach(kirja -> kirjat.add(kirja));  
            
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        
        
        return kirjat;
    }

}
