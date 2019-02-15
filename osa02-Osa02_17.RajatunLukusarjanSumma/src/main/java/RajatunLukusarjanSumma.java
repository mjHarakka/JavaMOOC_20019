
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mihin asti? ");
        int alku = Integer.valueOf(lukija.nextLine());
        System.out.println("Mihin asti? ");
        int loppu = Integer.valueOf(lukija.nextLine());
        
        int summa = 0;
        
        for (int i = alku; i <= loppu; i++) {
            summa += i;
        }
        
        System.out.println("Summa on " + summa);
        
    }
}
