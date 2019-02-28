
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int eka = 0;
        int toka = 0;
        
        while (true) {
            
            System.out.println("Ensimmäinen: " + eka + "/100");
            System.out.println("Toinen: " + toka + "/100");

            String luettu = lukija.nextLine();
            
            String[] osat = luettu.split(" ");
            String komento = osat[0];
            int luku = Integer.parseInt(osat[1]);
            
            if (komento.equals("lisaa")) {    
                if (eka + luku > 100) {
                    eka = 100;
                } else {
                    eka += luku;
                }   
            }
            
            if (komento.equals("siirra")) {
                if (luku > eka) {
                    toka += eka;
                    eka = 0;
                } else {
                    toka += luku;
                    eka -= luku;
                }
            }
            
            if (komento.equals("poista")) {
                if (luku > toka) {
                    toka = 0;
                } else {
                    toka -= luku;
                }
            }
            
            if (luettu.equals("lopeta")) {
                break;
            }

            System.out.println("");
            
        }
    }

}
