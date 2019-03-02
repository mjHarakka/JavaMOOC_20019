
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        
        
        
        System.out.println("Mistä luetaan? ");
        File tiedosto = new File(lukija.nextLine());
        Parser parser = new Parser(tiedosto);
        parser.parse();
        parser.parseIntoObjects();
        
        System.out.println("Komennot:\n" +
        "listaa - listaa reseptit\n" +
        "lopeta - lopettaa ohjelman\n" +
        "hae nimi - hakee reseptiä nimen perusteella\n" +
        "hae keittoaika - hakee reseptiä keittoajan perusteella\n" +
        "hae aine - hakee reseptiä raaka-aineen perusteella");
        
        while (true) {
            
        }
        
    }

}
