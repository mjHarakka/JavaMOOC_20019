
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mihin asti? ");
        int luku = Integer.valueOf(lukija.nextLine());
        
        int summa = 0;
        
        for (int i = 1; i <= luku; i++) {
            summa += i;
        }
        
        System.out.println("Summa on " + summa);
    }
}
