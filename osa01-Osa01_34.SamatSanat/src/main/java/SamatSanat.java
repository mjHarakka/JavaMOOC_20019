
import java.util.Scanner;

public class SamatSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        System.out.println("Syötä ensimmäinen merkkijono: ");
        String sana1 = lukija.nextLine();
        System.out.println("Syötä toinen merkkijono: ");
        String sana2 = lukija.nextLine();
        
        
        if (sana1.equals(sana2)) {
            System.out.println("Samat sanat!");
        } else {
            System.out.println("Ei sitten");
        }
    }
}
