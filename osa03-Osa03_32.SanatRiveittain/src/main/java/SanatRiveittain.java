
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            String syote = lukija.nextLine();
            
            if (syote.equals("")) {
                break;
            }

            String[] sanat = syote.split(" ");

            for (String sana: sanat) {
                System.out.println(sana);
            }
        }

    }
}
