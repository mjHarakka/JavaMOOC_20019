
import java.util.Scanner;

public class LukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int summa = 0;
        int luku = 0;
        
        while (true) {
            
            luku = Integer.valueOf(lukija.nextLine());
            summa += luku;
            
            if (luku == 0) {
                System.out.println(summa);
                break;
            }
            
            summa += Integer.valueOf(lukija.nextLine());
            
            
            
        }
        
    }
}
