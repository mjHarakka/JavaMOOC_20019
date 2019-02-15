
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna lukuja: ");
        Lukutilasto summa = new Lukutilasto();
        Lukutilasto parilliset = new Lukutilasto();
        Lukutilasto parittomat = new Lukutilasto();
        
        while(true) {
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == -1) {
                System.out.println("Summa " + summa.summa());
                System.out.println("Parillisten summa " + parilliset.summa());
                System.out.println("Parittomien summa " + parittomat.summa());
                break;
            }
            
            summa.lisaaLuku(luku);
            
            if (luku % 2 == 0) {
                parilliset.lisaaLuku(luku);
            } else {
                parittomat.lisaaLuku(luku);
            }
 
        }
    }
}
