
import java.util.Scanner;

public class SanaSanassa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna 1. sana");
        String sana1 = lukija.nextLine();
        System.out.println("Anna 2. sana");
        String sana2 = lukija.nextLine();
        boolean onko = false;
        
        if (sana1.indexOf(sana2) == -1)  {
            onko = false;
        } else {
            onko = true;
        }
        
        if (onko) {
            System.out.println("Sana '" + sana2 + "' on sanan '" + sana1 + "' osana.");
        } else {
            System.out.println("Sana '" + sana2 + "' ei ole sanan '" + sana1 + "' osana.");
        }
        
        
    }
}
