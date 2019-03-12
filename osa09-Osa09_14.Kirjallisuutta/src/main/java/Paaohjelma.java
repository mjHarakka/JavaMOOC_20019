
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Kirja> kirjat = new ArrayList<>();
        
        while (true) {
            System.out.println("Syötä kirjan nimi, tyhjä lopettaa: ");
            String nimi = lukija.nextLine();
            
            if (nimi.isEmpty()) {
                break;
            }
            
            System.out.println("Syötä kirjan pienin kohdeikä: ");
            int ika = Integer.valueOf(lukija.nextLine());
            
            kirjat.add(new Kirja(nimi, ika));
        }
        getKirjat(kirjat);
    }
    
    public static void getKirjat(List<Kirja> k) {
        
        Comparator<Kirja> vertailija = Comparator
              .comparing(Kirja::getKohdeIka)
              .thenComparing(Kirja::getNimi);

        Collections.sort(k, vertailija);
        
        System.out.println(k.size() + " kirjaa."
                + "\n" + "\n"
                + "Kirjat: " + "\n");
                k.stream()
                .forEach(kirja -> System.out.println(kirja));
    }

}
