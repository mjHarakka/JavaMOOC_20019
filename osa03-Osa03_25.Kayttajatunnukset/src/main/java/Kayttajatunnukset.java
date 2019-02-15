
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        String[] kayttaja1 = {"aleksi", "tappara"};
        String[] kayttaja2 = {"elina", "kissa"};

        System.out.println("Anna tunnus: ");
        String tunnus = lukija.nextLine();
        System.out.println("Anna salasana");
        String salasana = lukija.nextLine();
        
        boolean auth = false;
        
        if (tunnus.equals(kayttaja1[0]) && salasana.equals(kayttaja1[1]) ||
            tunnus.equals(kayttaja2[0]) && salasana.equals(kayttaja2[1])) {
            auth = true;
        }
        
        if (auth) {
            System.out.println("Olet kirjautunut järjestelmään");
        } else {
            System.out.println("Virheellinen tunnus tai salasana");
        }
        
        
        
    }
}
