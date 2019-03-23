
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Montako satunnaislukua tulostetaan? ");
        int montako = Integer.valueOf(lukija.nextLine());
        
        Random r = new Random();
        
        for (int i = 0; i < montako; i++) {
            int randVal = r.nextInt(11);
            System.out.println(randVal);
        }
        
    }

}
