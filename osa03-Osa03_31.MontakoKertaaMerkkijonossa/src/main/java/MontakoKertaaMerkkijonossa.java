
import java.util.Scanner;

public class MontakoKertaaMerkkijonossa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Mistä haetaan: ");
        String merkkijono = lukija.nextLine();
        System.out.print("Mitä haetaan: ");
        String haettava = lukija.nextLine();
        int kerrat = 0;
        int i = 0;
        int kohta = 0;
        
        while (i < merkkijono.length()) {
            
            if (merkkijono.indexOf(haettava, i) != -1) {
                kerrat++;
                kohta += merkkijono.indexOf(haettava) + haettava.length();
            } 
            i += kohta;
        }
        

        System.out.println("Merkkijonon " + haettava + " esiintymiskertoja: " + kerrat);
        
    }
}
