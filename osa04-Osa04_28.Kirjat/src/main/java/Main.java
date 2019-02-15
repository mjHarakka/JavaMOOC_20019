
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();
        
        while(true) {
            System.out.println("Nimi: ");
            String nimi = lukija.nextLine();
                    
            if (nimi.equals("")) {
                break;
            } 
            System.out.println("Sivuja: ");
            int sivuja = Integer.valueOf(lukija.nextLine());
            System.out.println("Kirjoitusvuosi");
            int kVuosi = Integer.valueOf(lukija.nextLine());
            
            kirjat.add(new Kirja(nimi, sivuja, kVuosi));
        }
        
        System.out.println("Mitä tulostetaan? ");
        String syote = lukija.nextLine();
        
        if (syote.equals("kaikki")) {
            for (Kirja kirja: kirjat) {
                System.out.println(kirja);
            }
        } else if (syote.equals("nimi")) {
            for (Kirja kirja: kirjat) {
                System.out.println(kirja.getNimi());
            }
        }
        
    }
}
