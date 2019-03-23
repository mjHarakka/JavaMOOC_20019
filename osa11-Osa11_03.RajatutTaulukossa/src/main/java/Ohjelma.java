
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit testata luokkaasi täällä

        int[] luvut = {3, -1, 8, 4};

        System.out.println(summa(luvut, 0, 0, 0, 0));
        System.out.println(summa(luvut, 0, 0, 0, 10));
        System.out.println(summa(luvut, 0, 1, 0, 10));
        System.out.println(summa(luvut, 0, 1, -10, 10));
        System.out.println(summa(luvut, -1, 999, -10, 10));
        
    }

    public static int summa(int[] taulukko, int mista, int mihin, int pienin, int suurin) {
        int[] tempTaulukko = taulukko;
        int summa = 0;
        
        int tempMista = mista;
        int tempMihin = mihin + 1;
        
        if (tempMista < 0) {
            tempMista = 0;
        }
        
        if (tempMihin > tempTaulukko.length) {
            tempMihin = tempTaulukko.length;
        }

        for (int i = tempMista; i < tempMihin; i++) {
            if (tempTaulukko[i] >= pienin && tempTaulukko[i] <= suurin) {
                
                summa += tempTaulukko[i];
            }
        }
        
        return summa;
    }
    
}
