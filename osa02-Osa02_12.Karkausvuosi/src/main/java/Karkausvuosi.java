
import java.util.Scanner;

public class Karkausvuosi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        boolean onkoKv = false;
        
        
        System.out.println("Anna vuosi: ");
        int vuosi = Integer.valueOf(lukija.nextLine());
        
        if (vuosi % 100 == 0 && vuosi % 400 == 0) {
            onkoKv = true;
        } else if (vuosi % 100 == 0 && vuosi % 400 != 0) {
            onkoKv = false;
        } else if (vuosi % 4 == 0) {
            onkoKv = true;
        }
        
        
        
        if (onkoKv) {
            System.out.println("Vuosi on karkausvuosi.");
        } else {
            System.out.println("Vuosi ei ole karkausvuosi.");
        }
        

    }
}
