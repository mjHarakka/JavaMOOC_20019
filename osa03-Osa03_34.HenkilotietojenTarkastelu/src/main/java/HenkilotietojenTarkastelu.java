
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> nimet = new ArrayList<>();
        ArrayList<String> vuodet = new ArrayList<>();

        while (true) {
            String syote = lukija.nextLine();
            
            if (syote.equals("")) {
                break;
            }
            
            nimet.add(syote.substring(0, syote.indexOf(",")));
            vuodet.add(syote.substring(syote.indexOf(",") + 1));

        }
        String pisinNimi = nimet.get(0);
        int summa = 0;
        
        for (int i = 0; i < nimet.size(); i++) {
            
            if (nimet.get(i).length() > pisinNimi.length()) {
                pisinNimi = nimet.get(i);
            }
            
            int luku = Integer.parseInt(vuodet.get(i));
            
            summa += luku;
            
        }
        
        System.out.println("Pisin nimi: " + pisinNimi);
        System.out.println("Syntymävuosien keskiarvo: " + summa / (double)vuodet.size());
        
        
    }
}
