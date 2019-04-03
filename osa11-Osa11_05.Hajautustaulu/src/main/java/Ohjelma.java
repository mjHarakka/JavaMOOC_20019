
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit testata luokkaasi täällä
        Pari<String, Integer> pari = new Pari<>("yksi", 1);
        Hajautustaulu hashTable = new Hajautustaulu();
        
        hashTable.lisaa(pari.getAvain(), pari.getArvo());
       
        System.out.println(hashTable.hae(pari));
        
    }

}
