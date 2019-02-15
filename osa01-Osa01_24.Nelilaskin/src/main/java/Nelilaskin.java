
import java.util.Scanner;

public class Nelilaskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int luku1 = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int luku2 = Integer.valueOf(lukija.nextLine());
        
        int yhteenlasku = (luku1 + luku2);
        int vahennyslasku = (luku1 - luku2);
        int kertolasku = (luku1 * luku2);
        double jakolasku = (luku1 / (double)luku2);
        
        System.out.println(luku1 + " + " + luku2 + " = "  + yhteenlasku);
        System.out.println(luku1 + " - " + luku2 + " = "  + vahennyslasku);
        System.out.println(luku1 + " * " + luku2 + " = "  + kertolasku);
        System.out.println(luku1 + " / " + luku2 + " = "  + jakolasku);
        
    }
}
