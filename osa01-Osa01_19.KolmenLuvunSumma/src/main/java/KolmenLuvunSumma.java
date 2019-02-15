
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne

        System.out.println("Syötä ensimmäinen luku!");
        int luku1 = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int luku2 = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int luku3 = Integer.valueOf(lukija.nextLine());
        System.out.println("Lukujen summa on " + (luku1 + luku2 + luku3));
    }
}
