
import java.util.Scanner;
import java.util.ArrayList;

public class Paaohjelma {
    

    public static void main(String[] args) {
        // HUOM! Älä luo ohjelmassa muita Scanner-olioita. Jos ja toivottavasti
        // kun teet muita luokkia, anna allaoleva Scanner-olio niille
        // tarvittaessa parametrina.
        ArrayList<Lintu> linnut = new ArrayList<>();

        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.println("?");
            String komento = lukija.nextLine();
            
            if (komento.equals("Lopeta")) {
                break;
            }
            
            if (komento.equals("Lisaa")) {
                System.out.println("Nimi: ");
                String nimi = lukija.nextLine();
                System.out.println("Latinankielinen nimi: ");
                String latinaNimi = lukija.nextLine();
                linnut.add(new Lintu(nimi, latinaNimi));
            }
            
            if (komento.equals("Havainto")) {
                System.out.println("Mikä havaittu? ");
                String havainto = lukija.nextLine();
                
                int i = 0;
                for (Lintu lintu: linnut) {
                    if (lintu.getNimi().equals(havainto)) {
                        lintu.lisaaHavainto();
                        i++;
                    }
                }
                
                if (i == 0) {
                    System.out.println("Ei ole lintu!");
                }
            }
            
            if (komento.equals("Tilasto")) {
                for (Lintu lintu: linnut) {
                    System.out.println(lintu);
                }
            }
            
            if (komento.equals("Nayta")) {
                
                System.out.println("Mikä? ");
                String nimi = lukija.nextLine();
                for (Lintu lintu: linnut) {
                    if (lintu.getNimi().equals(nimi)) {
                        System.out.println(lintu);
                    }
                }
            }
            
        }

    }

}
