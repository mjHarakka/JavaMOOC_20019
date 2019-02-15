
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // KIRJOITA OHJELMASI TÄNNE
        
        System.out.println("Mihin asti? ");
        int loppu = Integer.valueOf(lukija.nextLine());
        System.out.println("Mistä lähtien? ");
        int alku = Integer.valueOf(lukija.nextLine());
        
        for (int i = alku; i <= loppu; i++) {
            System.out.println(i);
        }
        
    }
}
