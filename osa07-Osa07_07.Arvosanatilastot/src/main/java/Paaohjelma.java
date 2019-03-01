
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
       
        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
        
        Laskuri laskuri = new Laskuri();
        
        System.out.println("Syötä yhteispisteet, -1 lopettaa");
        
        int luku = 0;
        int summa = 0;
        int maara = 0;
        int hyvSumma = 0;
        int hyvMaara = 0;
        
        int viisi = 0;
        int nelja = 0;
        int kolme = 0;
        int kaksi = 0;
        int yksi = 0;
        int nolla = 0;
        
        while (true) {
            
            luku = Integer.parseInt(lukija.nextLine());
            if (luku == -1) {
                break;
            }
            
            
            if (luku > 0 && luku <= 100) {
                summa += luku;
                maara++;
                laskuri.lisaa(luku);
                
                if (luku < 50) {
                    nolla++;
                } else if (luku < 60) {
                    yksi++;
                } else if (luku < 70) {
                    kaksi++;
                } else if (luku < 80) {
                    kolme++;
                } else if (luku < 90) {
                    nelja++;
                }  else if (luku >= 90) {
                    viisi++;
                }
                
                
            }
            
            if (luku >= 50 && luku <= 100) {
                hyvSumma += luku;
                hyvMaara++;
            }
               
        }
        
        System.out.println("Pisteiden keskiarvo (kaikki): " + laskuri.keskiarvo(summa, maara));     
        if (hyvMaara > 0) {
            System.out.println("Pisteiden keskiarvo (hyväksytyt) " + laskuri.keskiarvo(hyvSumma, hyvMaara));
        } else {
            System.out.println("Pisteiden keskiarvo (hyväksytyt) " + "-");
        }

        System.out.println("Hyväkysmisprosentti: " + 100 * laskuri.keskiarvo(hyvMaara, maara));
        
        System.out.println("5: " + laskuri.tahtiTehdas(viisi));
        System.out.println("4: " + laskuri.tahtiTehdas(nelja));
        System.out.println("3: " + laskuri.tahtiTehdas(kolme));
        System.out.println("2: " + laskuri.tahtiTehdas(kaksi));
        System.out.println("1: " + laskuri.tahtiTehdas(yksi));
        System.out.println("0: " + laskuri.tahtiTehdas(nolla));
        
        

    
        
    }
}
