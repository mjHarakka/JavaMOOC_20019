
import java.io.File;
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
            String komento = lukija.nextLine();
            
            if (komento.equals("lopeta")) {
                break;
            }
            
            if (komento.equals("hae aine")) {
                System.out.println("Mitä raaka-ainetta haetaan: ");
                String haettavaAine = lukija.nextLine();
                
                for (Resepti resepti: parser.getReseptit()) {
                    
                    if (resepti.getAineet().contains(haettavaAine)) {
                        System.out.println(resepti);
                    }
                    
                }     
            }
            
            if (komento.equals("hae nimi")) {
                System.out.println("Mitä haetaan: ");
                String haettavaNimi = lukija.nextLine();
                
                for (Resepti resepti: parser.getReseptit()) {
                    
                    if (resepti.getNimi().contains(haettavaNimi)) {
                        System.out.println(resepti);
                    }
                    
                }     
            }
            
            if (komento.equals("hae keittoaika")) {
                System.out.println("Keittoaika korkeintaan: ");
                int maxKeittoAika = Integer.valueOf(lukija.nextLine());
                
                for (Resepti resepti: parser.getReseptit()) {
                    if (resepti.getAika() <= maxKeittoAika) {
                        System.out.println(resepti);
                    } 
                }     
            }
            
            if (komento.equals("listaa")) {

                for (Resepti resepti: parser.getReseptit()) {
                    System.out.println(resepti);
                }     
            }

            
            
        }

    }
}

